import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WordCounterTest {

	@Test
	void test_word_counter_simple_input() {
		//Arrange
	    String input = "welcome to java world here you can see the java unit tests demo";
		String expected = "java,2";
		
		//Act
		String actual = WordCounter.getHighestCountWord(input);
		
		//Assert
		assertTrue(expected.equals(actual));
		assertTrue(actual.split(",")[0].equals("java"));
		assertTrue(actual.split(",")[1].equals("2"));
		
	}
	
	@Test
	void test_word_counter_equals_inputs() {
		//Arrange
	    String input = "welcome to java world!";
		String expected = "java,1";
		
		//Act
		String actual = WordCounter.getHighestCountWord(input);
		
		//Assert
		
		assertTrue(expected.equals(actual));
		assertTrue(actual.split(",")[0].equals("java"));
		assertTrue(actual.split(",")[1].equals("1"));	
	}
	
	@Test
	void test_word_counter_large_input() {
		//Arrange
	    String input = "Paragraphs are the building blocks of papers. Many students define paragraphs in terms of length: a paragraph is a group of at least five sentences, a paragraph is half a page long, etc. In reality, though, the unity and coherence of ideas among sentences is what constitutes a paragraph. A paragraph is defined as “a group of sentences or a single sentence that forms a unit” (Lunsford and Connors 116). Length and appearance do not determine whether a section in a paper is a paragraph. For instance, in some styles of writing, particularly journalistic styles, a paragraph can be just one sentence long. Ultimately, a paragraph is a sentence or group of sentences that support one main idea. In this handout, we will refer to this as the “controlling idea,” because it controls what happens in the rest of the paragraph.";
		String expected = "a,14";
		
		//Act
		String actual = WordCounter.getHighestCountWord(input);
		
		//Assert
		
		assertTrue(expected.equals(actual));
		assertTrue(actual.split(",")[0].equals("a"));
		assertTrue(actual.split(",")[1].equals("14"));	
	}

}
