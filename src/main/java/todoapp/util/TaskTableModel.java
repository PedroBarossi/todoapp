package todoapp.util;

import todoapp.model.Task;

import javax.swing.table.AbstractTableModel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class TaskTableModel extends AbstractTableModel {

    String[] columns = {"Nome", "Descrição", "Prazo", "Tarefa Concluída", "Editar", "Excluir"};
    List<Task> tasks = new ArrayList<>();

    @Override
    public int getRowCount() {
        return tasks.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    public String[] getColumns() {
        return columns;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0:
                return tasks.get(rowIndex).getName();
            case 1:
                return tasks.get(rowIndex).getDescription();
            case 2:
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                return dateFormat.format(tasks.get(rowIndex).getDeadline());
            case 3:
                return tasks.get(rowIndex).isCompleted();
            case 4,5:
                return "";
            default:
                return "s";
        }
    }

    @Override
    public String getColumnName(int columnIndex){
        return columns[columnIndex];
    }

    //para poder marcar se a tarefa foi completada (1)
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return columnIndex==3;
    }

    //para poder marcar se a tarefa foi completada (2)
    @Override
    public Class<?> getColumnClass(int columnIndex){
        if(tasks.isEmpty()) {
            return Object.class;
        }
        return this.getValueAt(0, columnIndex).getClass();
    }

    //para poder marcar se a tarefa foi completada (3)
    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
       tasks.get(rowIndex).setCompleted((boolean) value);
    }

}
