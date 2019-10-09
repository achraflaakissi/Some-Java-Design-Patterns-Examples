
public class Application {

	public static void main(String[] args) {

        Tag htmlContainer = new ParentTag("<html>", "</html>");
        Tag headContainer = new ParentTag("<head>", "</head>");
        Tag bodyContainer = new ParentTag("<body>", "</body>");
        Tag divContainer = new ParentTag("<div>", "</div>");
        Tag titrePage = new SimpleTag("Lorem ipsum Text", "<title>", "</title>");
        Tag titreh1 = new SimpleTag("Lorem ipsum", "<h1>", "</h1>");
        Tag p1 = new SimpleTag("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "<p>", "</p>");
        
        htmlContainer.addTag(headContainer);
        headContainer.addTag(titrePage);
        htmlContainer.addTag(bodyContainer);
        bodyContainer.addTag(divContainer);
        divContainer.addTag(titreh1);
        divContainer.addTag(p1);
        
        htmlContainer.afficherHTML();
	}

}
