package day2;

public class Hierarchy
{


}
/*
 * Component hierarchy
 * 
 * object--component
 * component--canvas checkbox choice label text component list container
 * text component--TextArea TextField
 * 
 * List of containers
 * Container-- panel	window
 * panel--applet--JApplet
 * window--dialog	frame
 * dialog-JDialog
 * frame-JFrame
 * 
 * window
 * 	cotainer without titles, can exist anywhere
 * frame
 * 	basic container with border/title or group components
 * panel
 * 	container to hold components
 * applet
 * 	basic container for web based applications
 * dialog
 * 	a dialog box is a type of window used to enable common communication 
 * 	or dialog between computer and user
 * 
 * Event listner
 * -- a component which acts as an event handler
 * -- passive component
 * -- needs to attach to the event source
 * -- register with ui component
 * -- can identify the source of event
 * -- delegate business logic
 * 
 * List of listners
 * Action Listeners
 * 	listens for component specific event
 * 	eg-button click
 * 
 * WindowListener
 * 	listens for window event
 * 	eg-window being closed
 * 
 * Mouse Listner
 * 	listens for mouse click, reease, entry, exit
 * 	eg-mouse being clicked on screen
 * 
 */
