/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package marytts.tools.newinstall;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;

import marytts.tools.newinstall.objects.Component;
import marytts.tools.newinstall.objects.VoiceComponent;

import org.apache.log4j.Logger;

/**
 * 
 * @author Jonathan
 */
public class InstallerGUI extends javax.swing.JFrame {

	// data
	private Installer installer;

	static Logger logger = Logger.getLogger(marytts.tools.newinstall.InstallerGUI.class.getName());

	/**
	 * Creates new form InstallerGUI
	 */
	public InstallerGUI(Installer installer) {
		logger.info("Starting InstallerGUI");
		if (installer == null) {
			logger.error("There is no installer object!");
			System.exit(1);
		}
		this.installer = installer;

		initComponents();

		fillComponentGroupPanels(this.installer.getAvailableComponents(null, null, null, null, null, true));

		addActionToAdvancedCheckBox();
		addActionToLogButton();
		addActionToMaryPathButton();
		fillComboBoxes();
		addActionToComboBox("locale", this.localeBox);
		addActionToComboBox("type", this.typeBox);
		addActionToComboBox("gender", this.genderBox);
		addActionToComboBox("status", this.statusBox);

		populateMaryPath();
	}

	/* @formatter:off */
    /**	
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        maryPathLabel = new javax.swing.JLabel();
        maryPathTextField = new javax.swing.JTextField();
        maryPathButton = new javax.swing.JButton();
        advancedCheckBox = new javax.swing.JCheckBox();
        logButton = new javax.swing.JButton();
        controlsPanel = new javax.swing.JPanel();
        localePanel = new javax.swing.JPanel();
        localeLabel = new javax.swing.JLabel();
        localeBox = new javax.swing.JComboBox();
        typePanel = new javax.swing.JPanel();
        typeLabel = new javax.swing.JLabel();
        typeBox = new javax.swing.JComboBox();
        genderPanel = new javax.swing.JPanel();
        genderBox = new javax.swing.JComboBox();
        genderLabel = new javax.swing.JLabel();
        statusPanel = new javax.swing.JPanel();
        statusLabel = new javax.swing.JLabel();
        statusBox = new javax.swing.JComboBox();
        voicesScrollPane = new javax.swing.JScrollPane();
        voicesGroupPanel = new javax.swing.JPanel();
        updateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Component Installer");
        setMinimumSize(new java.awt.Dimension(566, 512));

        maryPathLabel.setText("Path to marytts installation folder:");

        maryPathButton.setText("change");

        advancedCheckBox.setForeground(java.awt.Color.lightGray);
        advancedCheckBox.setText("show language and marytts components");
        advancedCheckBox.setToolTipText("Advanced users only!");
        advancedCheckBox.setName("advancedCheckBox"); // NOI18N

        logButton.setText("show log view");

        controlsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Use these controls to filter the list of available components"));

        localeLabel.setText("Locale");

        localeBox.setMaximumRowCount(20);

        javax.swing.GroupLayout localePanelLayout = new javax.swing.GroupLayout(localePanel);
        localePanel.setLayout(localePanelLayout);
        localePanelLayout.setHorizontalGroup(
            localePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(localePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(localePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(localeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(localeLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        localePanelLayout.setVerticalGroup(
            localePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(localePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(localeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(localeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        typeLabel.setText("Type");

        typeBox.setMaximumRowCount(20);

        javax.swing.GroupLayout typePanelLayout = new javax.swing.GroupLayout(typePanel);
        typePanel.setLayout(typePanelLayout);
        typePanelLayout.setHorizontalGroup(
            typePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(typePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(typePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(typeLabel)
                    .addComponent(typeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        typePanelLayout.setVerticalGroup(
            typePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(typePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(typeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(typeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        genderBox.setMaximumRowCount(20);

        genderLabel.setText("Gender");

        javax.swing.GroupLayout genderPanelLayout = new javax.swing.GroupLayout(genderPanel);
        genderPanel.setLayout(genderPanelLayout);
        genderPanelLayout.setHorizontalGroup(
            genderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(genderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genderBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        genderPanelLayout.setVerticalGroup(
            genderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(genderLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(genderBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        statusLabel.setText("Status");

        statusBox.setMaximumRowCount(20);

        javax.swing.GroupLayout statusPanelLayout = new javax.swing.GroupLayout(statusPanel);
        statusPanel.setLayout(statusPanelLayout);
        statusPanelLayout.setHorizontalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statusBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusLabel))
                .addGap(20, 20, 20))
        );
        statusPanelLayout.setVerticalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(statusLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout controlsPanelLayout = new javax.swing.GroupLayout(controlsPanel);
        controlsPanel.setLayout(controlsPanelLayout);
        controlsPanelLayout.setHorizontalGroup(
            controlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(localePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(typePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(genderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        controlsPanelLayout.setVerticalGroup(
            controlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlsPanelLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(controlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(statusPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(genderPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(typePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(localePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        voicesGroupPanel.setName("voicesGroupPanel"); // NOI18N

        javax.swing.GroupLayout voicesGroupPanelLayout = new javax.swing.GroupLayout(voicesGroupPanel);
        voicesGroupPanel.setLayout(voicesGroupPanelLayout);
        voicesGroupPanelLayout.setHorizontalGroup(
            voicesGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );
        voicesGroupPanelLayout.setVerticalGroup(
            voicesGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );

        voicesScrollPane.setViewportView(voicesGroupPanel);

        updateButton.setText("update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(advancedCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(controlsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(voicesScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(maryPathLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(maryPathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(maryPathButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maryPathLabel)
                    .addComponent(maryPathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maryPathButton)
                    .addComponent(updateButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(controlsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(voicesScrollPane)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(advancedCheckBox)
                    .addComponent(logButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    /* @formatter:on */

	// /**
	// * @param args
	// * the command line arguments
	// */
	// public static void main(String args[]) {

	/* Set the Nimbus look and feel */
	// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
	/*
	 * If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel. For details see
	 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
	 */
	// try {
	// for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	// if ("Nimbus".equals(info.getName())) {
	// javax.swing.UIManager.setLookAndFeel(info.getClassName());
	// break;
	// }
	// }
	// } catch (ClassNotFoundException ex) {
	// java.util.logging.Logger.getLogger(InstallerGUITmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	// } catch (InstantiationException ex) {
	// java.util.logging.Logger.getLogger(InstallerGUITmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	// } catch (IllegalAccessException ex) {
	// java.util.logging.Logger.getLogger(InstallerGUITmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	// } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	// java.util.logging.Logger.getLogger(InstallerGUITmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	// }
	// </editor-fold>

	/* Create and display the form */
	// java.awt.EventQueue.invokeLater(new Runnable() {
	// public void run() {
	// Installer installer = new Installer();
	// new InstallerGUITmp(installer).setVisible(true);
	// }
	// });
	// }

	private void addActionToLogButton() {
		this.logButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				logger.debug("Log View button has been clicked.");
				java.awt.EventQueue.invokeLater(new Runnable() {
					public void run() {
						LogViewFrame logViewFrame = new LogViewFrame();
						new LogViewFrame().setVisible(true);
					}
				});
			}
		});
	}

	private void addActionToMaryPathButton() {
		this.maryPathButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				java.awt.EventQueue.invokeLater(new Runnable() {
					public void run() {
						JFileChooser fileChooser = new JFileChooser();
						fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
						fileChooser.showOpenDialog(InstallerGUI.this);
						File maryBasePath = fileChooser.getSelectedFile();
						InstallerGUI.this.installer.setMaryBase(maryBasePath);
						InstallerGUI.this.maryPathTextField.setText(InstallerGUI.this.installer.getMaryBasePath());
						// TODO continue to implement -> what changes does Installer has to go through when marypath is updated?
						// Rebuild all components from scratch?
					}
				});
			}
		});
	}

	private void addActionToComboBox(final String attribute, final JComboBox comboBox) {

		comboBox.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				String locale = localeBox.getSelectedItem().toString();
				String type = typeBox.getSelectedItem().toString();
				String gender = genderBox.getSelectedItem().toString();
				String status = statusBox.getSelectedItem().toString();
				
				if (locale.equalsIgnoreCase("all")) {
					locale = null;
				}
				if (type.equalsIgnoreCase("all")) {
					type = null;
				}
				if (gender.equalsIgnoreCase("all")) {
					gender = null;
				}
				if (status.equalsIgnoreCase("all")) {
					status = null;
				}
				if (InstallerGUI.this.advancedCheckBox.isSelected()) {
					fillComponentGroupPanels(installer.getAvailableComponents(locale, type, gender, status, null, false));
				}
				else {
					fillComponentGroupPanels(installer.getAvailableComponents(locale, type, gender, status, null, true));
				}
			}
		});
	}

	private void addActionToAdvancedCheckBox() {
		this.advancedCheckBox.setSelected(false);
		this.advancedCheckBox.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				logger.debug("Checkbox state has been changed to " + e.getStateChange());
				if (e.getStateChange() == ItemEvent.SELECTED) {
					InstallerGUI.this.advancedCheckBox.setForeground(Color.BLACK);
					displayAdvancedComponents(false);
				} else {
					InstallerGUI.this.advancedCheckBox.setForeground(Color.lightGray);
					displayAdvancedComponents(true);
				}
			}
		});
	}

	protected void displayAdvancedComponents(boolean voiceOnly) {

		String locale = localeBox.getSelectedItem().toString();
		String type = typeBox.getSelectedItem().toString();
		String gender = genderBox.getSelectedItem().toString();
		String status = statusBox.getSelectedItem().toString();

		if (locale.equalsIgnoreCase("all")) {
			locale = null;
		}
		if (type.equalsIgnoreCase("all")) {
			type = null;
		}
		if (gender.equalsIgnoreCase("all")) {
			gender = null;
		}
		if (status.equalsIgnoreCase("all")) {
			status = null;
		}
		fillComponentGroupPanels(installer.getAvailableComponents(locale, type, gender, status, null, voiceOnly));
	}

	private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_updateButtonActionPerformed

	}// GEN-LAST:event_updateButtonActionPerformed

	/**
	 * 
	 * @param componentList
	 * @param componentGroupPanel
	 * @param componentTableModel
	 * @return
	 */
	private void fillComponentGroupPanels(List<Component> componentList) {

		logger.debug("(Re)filling component lists");
		logger.debug("Removing all components from voicesGroupPanel.");
		this.voicesGroupPanel.removeAll();
		if (!(componentList == null)) {
			this.voicesGroupPanel.setLayout(new BoxLayout(this.voicesGroupPanel, BoxLayout.Y_AXIS));
			logger.debug("voicesGroupPanel has PS: " + this.voicesGroupPanel.getPreferredSize());
			for (Component oneComponent : componentList) {
				ComponentPanel componentPanel;
				if (oneComponent instanceof VoiceComponent) {
					componentPanel = new ComponentPanel((VoiceComponent) oneComponent, installer);
				} else {
					componentPanel = new ComponentPanel(oneComponent, installer);
				}

				logger.debug("Created new ComponentPanel for component " + oneComponent.getName()
						+ " with preferred dimensions: " + componentPanel.getPreferredSize());
				logger.debug("Created new ComponentPanel for component " + oneComponent.getName() + " with dimensions: "
						+ componentPanel.getSize());

				this.voicesGroupPanel.add(componentPanel);
				this.voicesGroupPanel.add(Box.createVerticalGlue());

				// else {
				// ComponentPanel componentPanel = new ComponentPanel(oneComponent, installer);
				// logger.debug("Created new ComponentPanel for component " + oneComponent.getName()
				// + " with preferred dimensions: " + componentPanel.getPreferredSize());
				// this.languagesGroupPanel.add(componentPanel);
				// this.languagesGroupPanel.add(Box.createVerticalGlue());
				// }
			}
		}
		// logger.debug(this.languagesScrollPane.getVerticalScrollBar().getValue()
		// + " is the position of language pane vertical scroll bar");
		// this.languagesScrollPane.getVerticalScrollBar().setValue(0);
		// this.voicesScrollPane.getVerticalScrollBar().setValue(0);
		invalidate();
		validate();
		repaint();
	}

	private void fillComboBoxes() {
		logger.debug("Filling comboBoxes with data retrieved from installer.getAttributeValues()");
		HashMap<String, HashSet<String>> attributeValues = this.installer.getAttributeValues();
		for (Map.Entry<String, HashSet<String>> oneEntry : attributeValues.entrySet()) {
			JComboBox componentToFill = null;
			String key = oneEntry.getKey();
			if (key.equals("gender")) {
				componentToFill = this.genderBox;
			} else if (key.equals("locale")) {
				componentToFill = this.localeBox;
			} else if (key.equals("status")) {
				componentToFill = this.statusBox;
			} else if (key.equals("type")) {
				componentToFill = this.typeBox;
			}

			componentToFill.addItem("all");
			for (String oneValue : attributeValues.get(key)) {
				componentToFill.addItem(oneValue);
				logger.debug(oneValue + " was added to " + key + " comboBox");
			}
			componentToFill.setSelectedIndex(0);
		}
	}

	/**
	 * Fills the mary base path in the appropriate text field if it was specified before on the CommandLine
	 */
	private void populateMaryPath() {
		String maryBasePath = installer.getMaryBasePath();
		if (maryBasePath != null || !maryBasePath.isEmpty()) {
			this.maryPathTextField.setText(maryBasePath);
		}
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JCheckBox advancedCheckBox;
	private javax.swing.JPanel controlsPanel;
	private javax.swing.JComboBox genderBox;
	private javax.swing.JLabel genderLabel;
	private javax.swing.JPanel genderPanel;
	private javax.swing.JComboBox localeBox;
	private javax.swing.JLabel localeLabel;
	private javax.swing.JPanel localePanel;
	private javax.swing.JButton logButton;
	private javax.swing.JButton maryPathButton;
	private javax.swing.JLabel maryPathLabel;
	private javax.swing.JTextField maryPathTextField;
	private javax.swing.JComboBox statusBox;
	private javax.swing.JLabel statusLabel;
	private javax.swing.JPanel statusPanel;
	private javax.swing.JComboBox typeBox;
	private javax.swing.JLabel typeLabel;
	private javax.swing.JPanel typePanel;
	private javax.swing.JButton updateButton;
	private javax.swing.JPanel voicesGroupPanel;
	private javax.swing.JScrollPane voicesScrollPane;
	// End of variables declaration//GEN-END:variables
}
