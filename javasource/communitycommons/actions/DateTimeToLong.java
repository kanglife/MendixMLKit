// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package communitycommons.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import communitycommons.DateTime;

/**
 * Converts a DateTime to a Unix timestamps. (Milliseconds since 1-1-1970)
 */
public class DateTimeToLong extends CustomJavaAction<java.lang.Long>
{
	private java.util.Date dateObject;

	public DateTimeToLong(IContext context, java.util.Date dateObject)
	{
		super(context);
		this.dateObject = dateObject;
	}

	@java.lang.Override
	public java.lang.Long executeAction() throws Exception
	{
		// BEGIN USER CODE
		return DateTime.dateTimeToLong(dateObject);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "DateTimeToLong";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}