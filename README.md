# waves
An extremely simple Java GUI program displaying ocean waves. 



<h1>Executing the Program</h1>
One can download the executable Java archive (JAR) file with the filename 'waves.jar' and execute the program like so: <code>java -jar waves.jar</code>

<h1>Compiling the Program</h1>
Compiling this Java program is as simple as it gets. There is nothing to put on the classpath there are no packages. Simply navigate to where the 'Waves.java' file is and use the *javac* program like so to compile the program: <code>javac Waves.java</code>. This will create two class files: 
<ul>
  <li>Waves$1.class</li>
  <li>Waves.class</li>
</ul>

<h1>Creating the Executable Jar</h1>
Make sure the 1) class files, 2) waves2.jpg, and 3) MANIFEST.MF file are in the same directory. Ideally you would create a new folder on your operating system (OS) and places only these files in there. This will prevent errors and prevent confusion. Please do not re-name the jpeg as the source code specifically calls this filename. If the filename is changed the program will not work. Massive farts broken hearts. It may need to be stated that the program waves.java needs to be compiled as explained at the beginning of this readme. Now that we have our byte code, jpeg, and manifest file we can issue the following command to create the executable jar file: <code>jar -cfm waves.jar MANIFEST.MF Waves*.class waves2.jpeg</code> I am using a regular expression with the Waves class files. This command will put anything that starts with Waves and ends with class into the jar. Make sure you only have the two Waves class files shown in the list above in your directory or you will have something you may not want. 
<br/>
<img src="http://news.mit.edu/sites/mit.edu.newsoffice/files/images/2016/MIT-Rogue-Waves_0.jpg" />






