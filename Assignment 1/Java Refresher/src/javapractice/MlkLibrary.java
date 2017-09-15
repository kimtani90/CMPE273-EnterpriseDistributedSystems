package javapractice;

import java.util.List;

public class MlkLibrary implements Library{

	@Override
	public boolean findBook(String book, List<Book> list) {
		// TODO Auto-generated method stub
		
		for(Book b:list){
			if(b.bookName.equals(book))
				return true;
		}
			
		return false;
	}

}
