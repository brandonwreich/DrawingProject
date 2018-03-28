package art.view;

import art.controller.ArtController;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

import java.util.Hashtable;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ArtPanel extends JPanel
{
	private final int MINIMUM_EDGE = 5;
	private final int MAXIUM_EDGE = 20;
	private final int MINIMUM_SCALE = 20;
	private final int MAXIUM_SCALE = 100;
	
	private ArtController app;
	
	private SpringLayout appLayout;
	private ShapeCanvas canvas;
	
	private JPanel buttonPanel;
	private JPanel sliderPanel;
	
	private JSlider scaleSlider;
	private JSlider edgeSlider;
	
	private JButton triangleButton;
	private JButton rectangleButton;
	private JButton ellipseButton;
	private JButton polygonButton;
	private JButton clearButton;
	private JButton saveButton;
	private JButton colorButton;
	
	private int currentEdgeCount;
	private int currentScale;
	
	public ArtPanel(ArtController app)
	{
		super();
		this.app = app;
		appLayout = new SpringLayout();
		
		currentScale = MINIMUM_SCALE;
		currentEdgeCount = MINIMUM_EDGE;
		scaleSlider = new JSlider(MINIMUM_SCALE, MAXIUM_SCALE);
		edgeSlider = new JSlider(MINIMUM_EDGE, MAXIUM_EDGE);
		
		canvas = new ShapeCanvas(app);
		sliderPanel = new JPanel();
		buttonPanel = new JPanel();
		
		triangleButton = new JButton("Add Triangle");
		rectangleButton = new JButton("Add Rectangle");
		ellipseButton = new JButton("Add Ellipse");
		polygonButton = new JButton("Add Polygon");
		clearButton = new JButton("Clear Image");
		saveButton = new JButton("Save Image");
		colorButton = new JButton("Change Color");
		
		setupSliders();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupSliders()
	{
		
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
