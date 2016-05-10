<h3>Generating a key store from the command line</h3>

the following command will generate a keystore<br/>
<pre>keytool -genkey -alias mykeystorealias -keyalg RSA -keystore mykeystore.jks -keysize 2048</pre>
<br/>
Of course the parameters are self descriptive and we are using the RSA algorithm as well as a 2048 bits keysize. On my windows 7 familly edition, the keytool prompts you to input the keys file pass and to provide a few more informations (first and last names, ou, location, ...). The process ends by prompting you to provide the key pass

<h4>Using keytool -importpassword to import a passphrase</h4>
Using a command similar as<br/>
<pre>keytool -importpassword -alias secureitstore</pre>
the -importpassword will store a passphrase in the new KeyStore.SecretKeyEntry. This is another level of security beyond the standard passphrase that was asked when generating the store for instance.



