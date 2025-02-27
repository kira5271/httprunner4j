/**
 * har - HAR file reader, writer and viewer
 * Copyright (c) 2014-2016, Sandeep Gupta
 * <p>
 * http://sangupta.com/projects/har
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package vip.lematech.httprunner4j.model.har;

import lombok.Data;

import java.util.List;

/**
 * @author sangupta/lematech@foxmail.com
 * website http://lematech.vip/
 * @version 1.0.0
 */

@Data
public class HarLog {

	public static final String DEFAULT_HAR_VERSION = "1.1";

	private String version = DEFAULT_HAR_VERSION;

	private HarCreator creator;

	private HarCreator browser;

	private List<HarPage> pages;

	private List<HarEntry> entries;

	private String comment;

	@Override
	public String toString() {
		return "HarLog [version=" + version + ", creator=" + creator + ", browser=" + browser + ", pages=" + pages + ", entries=" + entries + ", comment=" + comment + "]";
	}

}
