package org.hypernovae.apis.java8.news;

import java.net.URLPermission;
import java.security.AccessControlException;
import java.security.AccessController;

/**
 * Introduced with java 8, URLPermission allows a definition a higher level permission
 * than standard java.net.SocketPermission allows. Now permission will be expressed using
 * URL scheme and Http request methods instead of low level, socket-related concepts. 
 * @author LOMPO
 *
 */
public class UrlPermissionDemo {
	public static void main(String[] args) {
		URLPermission urlPermission = new URLPermission("https://www.google.com/#q=spring+framework");
		try {
			AccessController.checkPermission(urlPermission);
			System.out.println("We can now proceed to open the corresponding socket....");
		} catch (AccessControlException aCE) {
			System.out.println(aCE.getMessage());
		}
	}
}
