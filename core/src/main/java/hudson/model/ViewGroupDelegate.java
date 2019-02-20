/*
 * The MIT License
 *
 * Copyright (c) 2004-2018, Sun Microsystems, Inc., Kohsuke Kawaguchi, Erik Ramfelt,
 * Tom Huybrechts, Vincent Latombe, CloudBees, Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package hudson.model;

import java.io.IOException;
import java.util.Collection;

import hudson.security.ACL;
import hudson.views.ViewsTabBar;

public class ViewGroupDelegate implements ViewGroup {
	private final ViewGroup delegate;

	/**
	 * @param delegate
	 */
	public ViewGroupDelegate(ViewGroup delegate) {
		this.delegate = delegate;
	}

	@Override
	public void save() throws IOException {
		delegate.save();
	}

	@Override
	public String getDisplayName() {
		return delegate.getDisplayName();
	}

	@Override
	public ACL getACL() {
		return delegate.getACL();
	}

	@Override
	public boolean canDelete(View view) {
		return delegate.canDelete(view);
	}

	@Override
	public void deleteView(View view) throws IOException {
		delegate.deleteView(view);
	}

	@Override
	public Collection<View> getViews() {
		return delegate.getViews();
	}

	@Override
	public View getView(String name) {
		return delegate.getView(name);
	}

	@Override
	public String getUrl() {
		return delegate.getUrl();
	}

	@Override
	public void onViewRenamed(View view, String oldName, String newName) {
		delegate.onViewRenamed(view, oldName, newName);
	}

	@Override
	public ViewsTabBar getViewsTabBar() {
		return delegate.getViewsTabBar();
	}
}