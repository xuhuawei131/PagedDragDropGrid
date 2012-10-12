package ca.laplanete.mobile.pageddragdropgrid;

import android.view.View;

public interface PagedDragDropGridAdapter {

	/**
	 * Used to create the paging
	 * 
	 * @return the page count
	 */
	public int pageCount();
	

	/**
	 * Returns the count of item in a page
	 * 
	 * @param page index
	 * @return item count for page
	 */
	public int itemCountInPage(int page);
	
	/**
	 * Returns the view for the item in the page
	 * 
	 * @param page index
	 * @param item index
	 * @return the view 
	 */
	public View view(int page, int index);
	
	/**
	 * The fixed row count (-1 for automatic computing)
	 * 
	 * @return row count or -1
	 */
	public int rowCount();
	
	/**
	 * The fixed column count (-1 for automatic computing)
	 * 
	 * @return column count or -1
	 */
	public int columnCount();

	
	/**
	 * Prints the layout in Log.d();
	 */
	public void printLayout();

	/**
	 * Swaps two items in he item list in a page
	 * 
	 * @param pageIndex
	 * @param itemIndexA
	 * @param itemIndexB
	 */
	public void swapItems(int pageIndex, int itemIndexA, int itemIndexB);

	/**
	 * Moves an item in the page on the left of provided the page
	 * 
	 * @param pageIndex
	 * @param itemIndex
	 */
	public void moveItemToPageOnLeft(int pageIndex, int itemIndex);

	/**
	 * Moves an item in the page on the right of provided the page
	 * 
	 * @param pageIndex
	 * @param itemIndex
	 */
	public void moveItemToPageOnRight(int pageIndex, int itemIndex);

	

}
