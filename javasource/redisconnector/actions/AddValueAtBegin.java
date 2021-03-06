// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package redisconnector.actions;

import redisconnector.impl.RedisConnector;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * LPUSH key value [value ...]
 * 
 * Insert all the specified values at the head of the list stored at key. If key does not exist, it is created as empty list before performing the push operations. When key holds a value that is not a list, an error is returned.
 * It is possible to push multiple elements using a single command call just specifying multiple arguments at the end of the command. Elements are inserted one after the other to the head of the list, from the leftmost element to the rightmost element. So for instance the command LPUSH mylist a b c will result into a list containing c as first element, b as second element and a as third element.
 * 
 * Return value
 * Integer reply: the length of the list after the push operations.
 * 
 * 
 * Examples
 * redis> LPUSH mylist "world"
 * (integer) 1
 * redis> LPUSH mylist "hello"
 * (integer) 2
 * redis> LRANGE mylist 0 -1
 * 1) "hello"
 * 2) "world"
 * redis> 
 */
public class AddValueAtBegin extends CustomJavaAction<Long>
{
	private String key;
	private String value;

	public AddValueAtBegin(IContext context, String key, String value)
	{
		super(context);
		this.key = key;
		this.value = value;
	}

	@Override
	public Long executeAction() throws Exception
	{
		// BEGIN USER CODE
		RedisConnector redisconnector = new RedisConnector(); 
		return redisconnector.lpush(key,value);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "AddValueAtBegin";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
