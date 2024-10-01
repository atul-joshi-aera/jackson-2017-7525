package com.malicious;

import java.nio.file.Files;
import java.nio.file.Paths;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Appweb
{
    public static void main( String[] args) throws IOException
    {
		ObjectMapper om = new ObjectMapper();
		om.enableDefaultTyping();

		Exploit exploit = om.readValue(Files.readAllBytes(Paths.get(args[0])), Exploit.class);
    }
}

class Exploit {
	public int id;
	public Object ob;
}
