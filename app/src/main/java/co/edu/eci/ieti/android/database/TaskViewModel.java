package co.edu.eci.ieti.android.database;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

import co.edu.eci.ieti.android.network.data.Task;

public class TaskViewModel {

    private TaskRepository mRepository;

    private final LiveData<List<Task>> mAllTasks;

    public TaskViewModel (Application application) {
        super();
        mRepository = new TaskRepository(application);
        mAllTasks = mRepository.getAllTasks();
    }

    LiveData<List<Task>> getAllTasks() { return mAllTasks; }

    public void insert(Task task) { mRepository.insert(task); }
    
}
