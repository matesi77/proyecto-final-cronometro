package cleanTest;

import activities.whenDo.CreateTaskScreen;
import activities.whenDo.MainScreen;
import activities.whenDo.MessageConfirmation;
import activities.whenDo.UpdateTaskScreen;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import session.Session;

import java.net.MalformedURLException;

public class WhenDoTest {

    private MainScreen mainScreen = new MainScreen();
    private CreateTaskScreen createTaskScreen = new CreateTaskScreen();
    private UpdateTaskScreen updateTaskScreen = new UpdateTaskScreen();
    private MessageConfirmation messageConfirmation = new MessageConfirmation();

    @Test
    public void verifyCreateTask() throws MalformedURLException {
        String title = "Remove";
        mainScreen.addTaskButton.click();
        createTaskScreen.titleTextBox.setValue(title);
        createTaskScreen.descriptionTextBox.setValue("Remove this task");
        createTaskScreen.saveButton.click();

        Assertions.assertEquals(title, mainScreen.nameTaskLabel.getText(), "Error, the task was not created");

    }

    @Test
    public void verifyUpdateTask() throws MalformedURLException {
        String title = "Task";
        String newTitle = "Title Updated";
        String description = "Description modified";
        mainScreen.addTaskButton.click();
        createTaskScreen.titleTextBox.setValue(title);
        createTaskScreen.descriptionTextBox.setValue("This is a task");
        createTaskScreen.saveButton.click();
        mainScreen.groupTask.click();
        updateTaskScreen.titleTextBox.setValue(newTitle);
        updateTaskScreen.descriptionTaskTextBox.setValue(description);
        updateTaskScreen.saveButton.click();
        Assertions.assertEquals(newTitle, mainScreen.nameTaskLabel.getText(), "Error, the task was not modified");
    }

    @Test
    public void verifyDeleteTask() throws MalformedURLException {
        String title = "Task";
        String description = "Task description";
        mainScreen.addTaskButton.click();
        createTaskScreen.titleTextBox.setValue(title);
        createTaskScreen.descriptionTextBox.setValue(description);
        createTaskScreen.saveButton.click();
        mainScreen.groupTask.click();
        updateTaskScreen.deleteButton.click();
        messageConfirmation.deleteButton.click();

        Assert.assertTrue(!mainScreen.isPresentNameTaskLabel());
    }

    @AfterEach
    public void close() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
