package Java_Version_8.java8Stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class StreamArticle {

	List<Article> articleList = getArticleList();
	Map<String, List<Article>> groupByMap;

	@Test
	public void forloop() {
		groupByMap = groupByAuthorByForLoop(articleList);
		for(String key : groupByMap.keySet()) {
			System.out.println(key+ " = "+groupByMap.get(key));
		}
	}

	@Test
	public void streammethod() {
		groupByMap = groupByAuthorUsingStream(articleList);
		for(String key : groupByMap.keySet()) {
			System.out.println(key+ " = "+groupByMap.get(key));
		}
	}

	private static Map<String, List<Article>> groupByAuthorUsingStream(List<Article> articleList) {
		return articleList.stream().collect(Collectors.groupingBy(Article::getAuthor));
	}

	private static Map<String, List<Article>> groupByAuthorByForLoop(List<Article> articleList) {

		Map<String, List<Article>> groupBymap = new HashMap<String, List<Article>>();

		for(Article article : articleList) {
			if(groupBymap.containsKey(article.getAuthor())) {
				groupBymap.get(article.getAuthor()).add(article);
			}else {
				ArrayList<Article> articles = new ArrayList<>();
				articles.add(article);
				groupBymap.put(article.getAuthor(), articles);
			}
		}
		return groupBymap;
	}

	private static List<Article> getArticleList(){
		List<Article> articlelist = new ArrayList<Article>();
		articlelist.add(new Article("Java book", "John", "Java"));
		articlelist.add(new Article("ruby book", "Venus", "ruby"));
		articlelist.add(new Article("C# book", "John", "csharp"));
		articlelist.add(new Article("Python book", "jupitor", "Py"));

		return articlelist;
	}
}