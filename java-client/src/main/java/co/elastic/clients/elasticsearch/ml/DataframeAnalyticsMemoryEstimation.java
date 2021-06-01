/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeAnalyticsMemoryEstimation
public final class DataframeAnalyticsMemoryEstimation implements ToJsonp {
	private final JsonValue expectedMemoryWithDisk;

	private final JsonValue expectedMemoryWithoutDisk;

	// ---------------------------------------------------------------------------------------------

	protected DataframeAnalyticsMemoryEstimation(Builder builder) {

		this.expectedMemoryWithDisk = Objects.requireNonNull(builder.expectedMemoryWithDisk,
				"expected_memory_with_disk");
		this.expectedMemoryWithoutDisk = Objects.requireNonNull(builder.expectedMemoryWithoutDisk,
				"expected_memory_without_disk");

	}

	/**
	 * Estimated memory usage under the assumption that overflowing to disk is
	 * allowed during data frame analytics. expected_memory_with_disk is usually
	 * smaller than expected_memory_without_disk as using disk allows to limit the
	 * main memory needed to perform data frame analytics.
	 *
	 * API name: {@code expected_memory_with_disk}
	 */
	public JsonValue expectedMemoryWithDisk() {
		return this.expectedMemoryWithDisk;
	}

	/**
	 * Estimated memory usage under the assumption that the whole data frame
	 * analytics should happen in memory (i.e. without overflowing to disk).
	 *
	 * API name: {@code expected_memory_without_disk}
	 */
	public JsonValue expectedMemoryWithoutDisk() {
		return this.expectedMemoryWithoutDisk;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("expected_memory_with_disk");
		generator.write(this.expectedMemoryWithDisk);

		generator.writeKey("expected_memory_without_disk");
		generator.write(this.expectedMemoryWithoutDisk);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeAnalyticsMemoryEstimation}.
	 */
	public static class Builder implements ObjectBuilder<DataframeAnalyticsMemoryEstimation> {
		private JsonValue expectedMemoryWithDisk;

		private JsonValue expectedMemoryWithoutDisk;

		/**
		 * Estimated memory usage under the assumption that overflowing to disk is
		 * allowed during data frame analytics. expected_memory_with_disk is usually
		 * smaller than expected_memory_without_disk as using disk allows to limit the
		 * main memory needed to perform data frame analytics.
		 *
		 * API name: {@code expected_memory_with_disk}
		 */
		public Builder expectedMemoryWithDisk(JsonValue value) {
			this.expectedMemoryWithDisk = value;
			return this;
		}

		/**
		 * Estimated memory usage under the assumption that the whole data frame
		 * analytics should happen in memory (i.e. without overflowing to disk).
		 *
		 * API name: {@code expected_memory_without_disk}
		 */
		public Builder expectedMemoryWithoutDisk(JsonValue value) {
			this.expectedMemoryWithoutDisk = value;
			return this;
		}

		/**
		 * Builds a {@link DataframeAnalyticsMemoryEstimation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeAnalyticsMemoryEstimation build() {

			return new DataframeAnalyticsMemoryEstimation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for DataframeAnalyticsMemoryEstimation
	 */
	public static final JsonpValueParser<DataframeAnalyticsMemoryEstimation> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new,
					DataframeAnalyticsMemoryEstimation::setupDataframeAnalyticsMemoryEstimationParser);

	protected static void setupDataframeAnalyticsMemoryEstimationParser(
			DelegatingJsonpValueParser<DataframeAnalyticsMemoryEstimation.Builder> op) {

		op.add(Builder::expectedMemoryWithDisk, JsonpValueParser.jsonValueParser(), "expected_memory_with_disk");
		op.add(Builder::expectedMemoryWithoutDisk, JsonpValueParser.jsonValueParser(), "expected_memory_without_disk");

	}

}