package mall;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.awt.event.ActionEvent;

public class StockManagerFrame extends MyFrame {

	static ArrayList<Goods> list = new ArrayList<Goods>(); 
	private JPanel contentPane;
	MyFrame frame = new MyFrame();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StockManagerFrame frame = new StockManagerFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StockManagerFrame() {
		
		setTitle("재고 관리창"); //title
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("상품 등록");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				StockRegister sr = new StockRegister();
			}
		});
		btnNewButton.setBounds(172, 39, 118, 44);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("상품 관리");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				StockManaging sm = new StockManaging();
			}
		});
		btnNewButton_1.setBounds(172, 107, 118, 44);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("상품 검색");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				StockSearch ss = new StockSearch();
			}
		});
		btnNewButton_2.setBounds(172, 173, 118, 44);
		contentPane.add(btnNewButton_2);
	}
	
	public void fileLoad(String path){
		FileInputStream fi = null;
		InputStreamReader isr = null;
		BufferedReader bfr = null;
		StringTokenizer st = null;
		
		try{
				list.clear();
				fi = new FileInputStream(path);
				isr = new InputStreamReader(fi);
				bfr = new BufferedReader(isr);
				String str = null;
				while((str = bfr.readLine())!= null){
					Goods g = new Goods();
					st = new StringTokenizer(str,",");
					g.setId(Integer.parseInt(st.nextToken()));
					g.setgName(st.nextToken());
					g.setStockNum(Integer.parseInt(st.nextToken()));
					g.setgPrice(Integer.parseInt(st.nextToken()));
	
					list.add(g);
				}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				fi.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
	
	public void fileSave(String path){
		 FileWriter fw = null;
		 try{
		   fw = new FileWriter(path);
		   for(int i=0; i<list.size(); i++){
			   fw.write(list.get(i).getId());
			   fw.write(",");
			   fw.write(list.get(i).getgName());
			   fw.write(",");
			   fw.write(list.get(i).getStockNum());
			   fw.write(",");
			   fw.write(list.get(i).getgPrice());
			   fw.write("\r\n");
		   }       
	    }catch (Exception e) {
	    	e.printStackTrace();
	   }finally{
			try{
				fw.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}


	
}
