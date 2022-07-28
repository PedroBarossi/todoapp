package todoapp.util;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class ButtonColumnCellRenderer extends DefaultTableCellRenderer {

    private String buttonType;

    public ButtonColumnCellRenderer(String buttonType) {
        this.buttonType = buttonType;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                                                   boolean hasFocus, int row, int column) {

        JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        label.setHorizontalAlignment(CENTER);
        label.setIcon(new javax.swing.ImageIcon(getClass().
                getResource("/" + buttonType + ".png")));
        return label;
    }

    public String getButtonType() {
        return buttonType;
    }

    public void setButtonType(String buttonType) {
        this.buttonType = buttonType;
    }
}
