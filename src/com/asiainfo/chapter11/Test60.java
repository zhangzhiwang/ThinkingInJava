package com.asiainfo.chapter11;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/**
 * AbstractCollection与Collection
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年12月1日 上午9:32:56
 */
public class Test60 extends AbstractCollection {// AbstractCollection实现了Collection接口的大部分方法，所以如果你想写一个新的集合类，继承AbstractCollection只需要实现两个方法即可，详见：http://zhidao.baidu.com/link?url=l93nLzsFQ6gOz7zd-Hzo4tIaIb8jWCVGMsLogCtisM16w0FhOgOx8g0abtJ9zUfZs6tWoxS_wbS3cw3JGyC4swMgCMh1I1QB8ztLjC49e5y

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}

class AA implements Collection {

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}
}