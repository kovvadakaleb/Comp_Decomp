# Comp_Decomp

This App will compress and decompress the files.

Creating GUI:

First we create Frame using JFrame class and set sizes that we need.
In this I used Four classes (Main,Window,Compress,Decompress).
after that create two buttons compressbutton and decompressbutton using JButton class then override actionperformed method for for which  button has to be the user clicked.
if it is compression button then call to that class  otherwise call to decompress class using their object.
we add JFileChooser in our both sources, when we click on buttons our system files will pop up.
give the file path as argument to method class of both compress and decompress classes.
By taking FileInputStreamReader for reading file and FileOutputStreamReader for writing file with byte data.
For the Compression files we take GZIPOutputStream to get reduced byte file.
For the deCompression files we take GZIPInputStream to get Original file.
After that close all the Streams for avoiding memory leakage.
From the main function we call the window class and from window class we call to respective classes using actionperformed method. 

