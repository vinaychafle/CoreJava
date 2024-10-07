package javastreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StreamsDemo {

	
		@Test()
		public void ArrayDemo1(){
			ArrayList<String> names=new ArrayList<String>();
			names.add("Shubham");
			names.add("Ram");
			names.add("Krishna");
			names.add("Shiv");
			names.add("Hanuman");
			
			for(int i=0;i<names.size();i++)
			{
				if(names.get(i).contains("K"))
				{
					System.out.println(names.get(i));
				}
			}
		}
		
		@Test()
		public void testStream()
		{
			ArrayList<String> names=new ArrayList<String>();
			names.add("Shubham");
			names.add("Ram");
			names.add("Krishna");
			names.add("Shiv");
			names.add("Hanuman");
			
			long n=names.stream().filter(s->s.startsWith("S")).count();
			System.out.println(n);
			
			long a=Stream.of("Shubham","Ram","Krishna","Shiv","Hanuman").filter(s->
			{
			s.startsWith("K");
			return true;
			}).count();
			System.out.println(a);
			
			//names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
			names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
		}
		
		@Test()
		public void stream2Map()
		{
			ArrayList<String> names=new ArrayList<String>();
			names.add("mark");
			names.add("soly");
			names.add("John");
			names.add("Will");
			names.add("Eleven");
			
			System.out.println("***************");
			Stream.of("Shubhama","Ram","Krishna","Shiv","Hanuman").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
			.forEach(s->System.out.println(s));
			System.out.println("***************");
			List<String> name1=Arrays.asList("Shubhama","Ram","Krishna","Shiv","Hanuman");
			
			name1.stream().filter(s->s.startsWith("S")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
			//Merging two stream
			Stream<String> newStream=Stream.concat(names.stream(), name1.stream());
			//newStream.sorted().forEach(s->System.out.println(s));
		
			boolean st=newStream.anyMatch(s->s.equalsIgnoreCase("Ram"));
			Assert.assertTrue(st);
		}
		
		@Test()
		public void streamcollect(){
			
			List<String>li=Stream.of("Shubhama","Ram","Krishna","Shiv","Hanuman").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
			.collect(Collectors.toList());
			
			System.out.println(li.get(0));
			
			List<Integer> values=Arrays.asList(3,2,2,7,9,8,8,5,6,8);
			values.stream().distinct().forEach(s->System.out.println(s));
			List<Integer>sort=values.stream().distinct().sorted().collect(Collectors.toList());
			System.out.println("***************");
			System.out.println(sort.get(2));
		}
		
		
	

}
