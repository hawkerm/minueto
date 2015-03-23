Minueto
=======
Minueto - The Game Development Framework 
Copyright (c) 2004 McGill University
3480 University Street, Montreal, Quebec H3A 2A7
 
Minueto is a multi-platform 2D Graphic API for Java which is easy to learn and use. 
Minueto also addresses other game programming concerns such as Input from 
Keyboard/Mouse and Sound playback.
 
This library is free software; you can redistribute it and/or
modify it under the terms of the GNU Lesser General Public
License as published by the Free Software Foundation; either
version 2.1 of the License, or (at your option) any later version.
  
This library is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
Lesser General Public License for more details.
  
You should have received a copy of the GNU Lesser General Public
License along with this library; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 
System Requirements
===================
 
 * Minueto has been tested using JDK 1.4.2 and JDK 6.0 (1.6). 
 * Minueto runs on the Windows XP, MacOs X and Linux platform.
 * A 500 Mhz machine is sufficient for development purposes.
 * A 1 Ghz machine is required to run a game that requires a fast framerate.

Installation
============

Download the Minueto SDK. Unzip the Minueto package using your favorite
zip program. On Linux, you can use the following command :

unzip Minueto_2.1.zip
 
Once you unzip the full package, you'll find the following directory 
structure.

    |- readme.md        : This file
    |- license          : Minueto's licence (LGPL v2.1)
    |- changelog.txt    : Changes in Minueto
    |- todo.md          : Things to maybe do in the near future
    |- build.xml        : Allows you to compile Minueto
    |---\ lib           : Minueto's runtime jar
    |---\ api           : Minueto's api documentation
    |---\ samples       : Multiple examples to get you started
    |---\ Minueto       : Minueto's source
 
If you want to start developing with Minueto, don't forget to add 
Minueto.jar in the lib directory to your classpath. You can find more 
information on changing your classpath at :
 
<http://www.dynamic-apps.com/tutorials/classpath.jsp>
 
Samples
=======
 
You will find in the sample directory several examples on how to use
Minueto. Each example has a make.sh and a make.bat shellscript that
you can use to build and run the sample. Please note that both scripts
expect the javac and java command to be in your path.
 
Documentation
=============
 
The API to use Minueto can be found in the API directory or online <https://cdn.rawgit.com/Mikeware/minueto/master/api/index.html>. You can also find a 
lot of information on Minueto at <http://github.com/Mikeware/minueto>

Compiling
=========

You can compile a new Minueto.jar runtime using Ant. From the sdk root 
directory:

    ant all

Contact
=======
 
Minueto is a project of the McGill  Software Engineering Lab. 
<http://www.cs.mcgill.ca/~joerg/sel/>

If you're having trouble with Minueto, please feel free to search or file an issue at
<http://github.com/Mikeware/minueto/issues>.
 