package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;

public class AddRabbitWithHealthActionListener implements ActionListener,Serializable {

	private int rows;
	private int columns;
	private ParcelFrameRole[][] fieldGrid;

	public AddRabbitWithHealthActionListener(int rows, int columns, ParcelFrameRole[][] fieldGrid) {
		super();
		this.rows = rows;
		this.columns = columns;
		this.fieldGrid = fieldGrid;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ItemTypeRole rabbitWithHealthItem = new RabbitWithHealthItem();

		for (int i = 2; i < rows; i++) {
			for (int j = 2; j < columns; j++) {
				((InsideParcelFrame) fieldGrid[i][j]).removeActionListener();
			}
		}

		for (int i = 1; i < rows + 1; i++) {
			if(((InsideParcelFrame) fieldGrid[i][1]).isEmpty() || ((InsideParcelFrame) fieldGrid[i][columns]).isEmpty()) {
				((InsideParcelFrame) fieldGrid[i][1]).setItemType(rabbitWithHealthItem);
				((InsideParcelFrame) fieldGrid[i][columns]).setItemType(rabbitWithHealthItem);
			}
		}

		for (int j = 1; j < columns + 1; j++) {
			if(((InsideParcelFrame) fieldGrid[1][j]).isEmpty() || ((InsideParcelFrame) fieldGrid[rows][j]).isEmpty()) {
				((InsideParcelFrame) fieldGrid[1][j]).setItemType(rabbitWithHealthItem);
				((InsideParcelFrame) fieldGrid[rows][j]).setItemType(rabbitWithHealthItem);
			}
		}
	}

}
