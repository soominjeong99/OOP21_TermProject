package mall;

import java.awt.Dimension;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;

public class AllSearch extends StockManagerFrame{
	MyFrame frame5 = new MyFrame();
	private JTable table_1;
	public AllSearch() {
		frame5.setTitle("전체상품");
		frame5.setSize(700, 448);
		frame5.setLocation(350, 250);
		frame5.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		frame5.getContentPane().setLayout(null);
		
		JTable table = null;
		String[] column =  {
			"상품ID", "상품명", "상품수량", "상품가격"
		};
		Object[][] ob = new Object[list.size()][4];
		for(int i=0; i<list.size(); i++){
				ob[i][0] = list.get(i).getId();
				ob[i][1] = list.get(i).getgName();
				ob[i][2] = list.get(i).getStockNum();
				ob[i][3] = list.get(i).getgPrice();
		}
		
		table= new JTable(ob,column);
		table.getColumn("ID").setPreferredWidth(150);
		table.getColumn("상품명").setPreferredWidth(170);
		table.getColumn("상품수량").setPreferredWidth(170);
		table.getColumn("상품가격").setPreferredWidth(170);
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(SwingConstants.CENTER);
		TableColumnModel tcm = table.getColumnModel();
		for(int i=0; i<tcm.getColumnCount(); i++){
			tcm.getColumn(i).setCellRenderer(dtcr);
		}
		
		table.setSize(660,387);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setSize(660, 387);	
		scrollPane.setLocation(12, 10);
		scrollPane.setPreferredSize(new Dimension(369, 203));
		frame5.getContentPane().add(scrollPane);
		
		frame5.setVisible(true);
	}
}
