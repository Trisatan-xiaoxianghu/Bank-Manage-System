package app;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class MainFrame extends JFrame implements ActionListener {

	public MainFrame(String title) {
		super(title);
		init();
	}
	JLabel label_info;
	JButton bt_createAccount;
	JButton bt_saveMoney;
	JButton bt_getMoney;
	JButton bt_turnAccount;
	JButton bt_select;
	JButton bt_updatePassword;
	JButton bt_destroyAccount;
	JButton bt_exit;
	private void init() {
		label_info=new JLabel("----��ӭʹ�����й���ϵͳ----");
		label_info.setHorizontalAlignment(JLabel.CENTER);
		bt_createAccount=new JButton("����");
		bt_saveMoney=new JButton("���");
		bt_getMoney=new JButton("ȡ��");
		bt_turnAccount=new JButton("ת��");
		bt_select=new JButton("��ѯ");
		bt_updatePassword=new JButton("�޸�����");
		bt_destroyAccount=new JButton("����");
		bt_exit=new JButton("�˳�");
		add(label_info);		
		add(bt_createAccount);
		add(bt_saveMoney);
		add(bt_getMoney);
		add(bt_turnAccount);
		add(bt_select);
		add(bt_updatePassword);
		add(bt_destroyAccount);
		add(bt_exit);
		
		bt_createAccount.addActionListener(this);
		bt_saveMoney.addActionListener(this);
		bt_getMoney.addActionListener(this);
		bt_turnAccount.addActionListener(this);
		bt_select.addActionListener(this);
		bt_updatePassword.addActionListener(this);
		bt_destroyAccount.addActionListener(this);
		bt_exit.addActionListener(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 300, 300, 300);
		setLayout(new GridLayout(9,1));
		setVisible(true);
			}

	public static void main(String[] args) {
		new MainFrame("��ӭ�������й���ϵͳ");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="����")
		{
			new CreateAccountFrame("����");
		}
		else
		{
			if(e.getActionCommand()=="���")
			{
				new SaveMoneyFrame("���");
			}
			else
			{
				if(e.getActionCommand()=="ȡ��")
				{
					new GetMoneyFrame("ȡ��");
				}
				else
				{
					if(e.getActionCommand()=="ת��")
					{
						new TurnAccountFrame("ת��");
					}
					else
					{
						if(e.getActionCommand()=="��ѯ")
						{
							new SelectAccountFrame("��ѯ");
						}
						else
						{
							if(e.getActionCommand()=="�޸�����")
							{
								new ModPasswordFrame("�޸�����");
							}
							else
							{
								if(e.getActionCommand()=="����")
								{
									new DestroyAccountFrame("����");
								}
								else
								{									
									System.exit(0);
								}
							}
						}
					}
				}
			}
		}	
	}
}
