package org.hypernovae.apis.strong.random;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * To generate random numbers that fit into a secure context usage, use the SecureRandom class.
 * It has a static method called getInstanceStrong that allows you to produce a SecureRandom instance
 * that was selected on the basis of the algorithms or providers that were specified via the SecureRandom.strongAlgorithmSecurity
 * property. A secure context where the use of SecureRandom fits would be, for example, the generation
 * of RSA public and private keys.
 * @author LOMPO
 *
 */
public class StrongRandomDemo {
	public static void main(String[] args) throws NoSuchAlgorithmException {
		SecureRandom strongAndSecureRandom = SecureRandom.getInstanceStrong();
		byte[] seed = strongAndSecureRandom.generateSeed(20);
		double strongAndSecureRandomDouble = strongAndSecureRandom.nextDouble()*5000.0D;
		System.out.println("value = " + strongAndSecureRandomDouble);
	}
}
