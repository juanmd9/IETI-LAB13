package co.edu.eci.ieti.android.network.data;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(tableName = "task_table")
public @Data class Task implements Serializable {

    private static final long serialVersionUID = 1L;

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "id")
    private Long id;

    private String description;

    private String status;

    private String responsible;

    private Date dueDate;

}