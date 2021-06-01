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
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.put_data_frame_analytics.Response
public final class PutDataFrameAnalyticsResponse implements ToJsonp {
	private final String id;

	private final Number createTime;

	private final String version;

	private final DataframeAnalyticsSource source;

	@Nullable
	private final String description;

	private final DataframeAnalyticsDestination dest;

	private final JsonValue modelMemoryLimit;

	private final Boolean allowLazyStart;

	private final Number maxNumThreads;

	private final DataframeAnalysisContainer analysis;

	@Nullable
	private final JsonValue analyzedFields;

	// ---------------------------------------------------------------------------------------------

	protected PutDataFrameAnalyticsResponse(Builder builder) {

		this.id = Objects.requireNonNull(builder.id, "id");
		this.createTime = Objects.requireNonNull(builder.createTime, "create_time");
		this.version = Objects.requireNonNull(builder.version, "version");
		this.source = Objects.requireNonNull(builder.source, "source");
		this.description = builder.description;
		this.dest = Objects.requireNonNull(builder.dest, "dest");
		this.modelMemoryLimit = Objects.requireNonNull(builder.modelMemoryLimit, "model_memory_limit");
		this.allowLazyStart = Objects.requireNonNull(builder.allowLazyStart, "allow_lazy_start");
		this.maxNumThreads = Objects.requireNonNull(builder.maxNumThreads, "max_num_threads");
		this.analysis = Objects.requireNonNull(builder.analysis, "analysis");
		this.analyzedFields = builder.analyzedFields;

	}

	/**
	 * API name: {@code id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * API name: {@code create_time}
	 */
	public Number createTime() {
		return this.createTime;
	}

	/**
	 * API name: {@code version}
	 */
	public String version() {
		return this.version;
	}

	/**
	 * API name: {@code source}
	 */
	public DataframeAnalyticsSource source() {
		return this.source;
	}

	/**
	 * API name: {@code description}
	 */
	@Nullable
	public String description() {
		return this.description;
	}

	/**
	 * API name: {@code dest}
	 */
	public DataframeAnalyticsDestination dest() {
		return this.dest;
	}

	/**
	 * API name: {@code model_memory_limit}
	 */
	public JsonValue modelMemoryLimit() {
		return this.modelMemoryLimit;
	}

	/**
	 * API name: {@code allow_lazy_start}
	 */
	public Boolean allowLazyStart() {
		return this.allowLazyStart;
	}

	/**
	 * API name: {@code max_num_threads}
	 */
	public Number maxNumThreads() {
		return this.maxNumThreads;
	}

	/**
	 * API name: {@code analysis}
	 */
	public DataframeAnalysisContainer analysis() {
		return this.analysis;
	}

	/**
	 * API name: {@code analyzed_fields}
	 */
	@Nullable
	public JsonValue analyzedFields() {
		return this.analyzedFields;
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

		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("create_time");
		generator.write(this.createTime.doubleValue());

		generator.writeKey("version");
		generator.write(this.version);

		generator.writeKey("source");
		this.source.toJsonp(generator, mapper);

		if (this.description != null) {

			generator.writeKey("description");
			generator.write(this.description);

		}

		generator.writeKey("dest");
		this.dest.toJsonp(generator, mapper);

		generator.writeKey("model_memory_limit");
		generator.write(this.modelMemoryLimit);

		generator.writeKey("allow_lazy_start");
		generator.write(this.allowLazyStart);

		generator.writeKey("max_num_threads");
		generator.write(this.maxNumThreads.doubleValue());

		generator.writeKey("analysis");
		this.analysis.toJsonp(generator, mapper);

		if (this.analyzedFields != null) {

			generator.writeKey("analyzed_fields");
			generator.write(this.analyzedFields);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutDataFrameAnalyticsResponse}.
	 */
	public static class Builder implements ObjectBuilder<PutDataFrameAnalyticsResponse> {
		private String id;

		private Number createTime;

		private String version;

		private DataframeAnalyticsSource source;

		@Nullable
		private String description;

		private DataframeAnalyticsDestination dest;

		private JsonValue modelMemoryLimit;

		private Boolean allowLazyStart;

		private Number maxNumThreads;

		private DataframeAnalysisContainer analysis;

		@Nullable
		private JsonValue analyzedFields;

		/**
		 * API name: {@code id}
		 */
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code create_time}
		 */
		public Builder createTime(Number value) {
			this.createTime = value;
			return this;
		}

		/**
		 * API name: {@code version}
		 */
		public Builder version(String value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code source}
		 */
		public Builder source(DataframeAnalyticsSource value) {
			this.source = value;
			return this;
		}

		/**
		 * API name: {@code source}
		 */
		public Builder source(Function<DataframeAnalyticsSource.Builder, ObjectBuilder<DataframeAnalyticsSource>> fn) {
			return this.source(fn.apply(new DataframeAnalyticsSource.Builder()).build());
		}

		/**
		 * API name: {@code description}
		 */
		public Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * API name: {@code dest}
		 */
		public Builder dest(DataframeAnalyticsDestination value) {
			this.dest = value;
			return this;
		}

		/**
		 * API name: {@code dest}
		 */
		public Builder dest(
				Function<DataframeAnalyticsDestination.Builder, ObjectBuilder<DataframeAnalyticsDestination>> fn) {
			return this.dest(fn.apply(new DataframeAnalyticsDestination.Builder()).build());
		}

		/**
		 * API name: {@code model_memory_limit}
		 */
		public Builder modelMemoryLimit(JsonValue value) {
			this.modelMemoryLimit = value;
			return this;
		}

		/**
		 * API name: {@code allow_lazy_start}
		 */
		public Builder allowLazyStart(Boolean value) {
			this.allowLazyStart = value;
			return this;
		}

		/**
		 * API name: {@code max_num_threads}
		 */
		public Builder maxNumThreads(Number value) {
			this.maxNumThreads = value;
			return this;
		}

		/**
		 * API name: {@code analysis}
		 */
		public Builder analysis(DataframeAnalysisContainer value) {
			this.analysis = value;
			return this;
		}

		/**
		 * API name: {@code analysis}
		 */
		public Builder analysis(
				Function<DataframeAnalysisContainer.Builder, ObjectBuilder<DataframeAnalysisContainer>> fn) {
			return this.analysis(fn.apply(new DataframeAnalysisContainer.Builder()).build());
		}

		/**
		 * API name: {@code analyzed_fields}
		 */
		public Builder analyzedFields(@Nullable JsonValue value) {
			this.analyzedFields = value;
			return this;
		}

		/**
		 * Builds a {@link PutDataFrameAnalyticsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutDataFrameAnalyticsResponse build() {

			return new PutDataFrameAnalyticsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for PutDataFrameAnalyticsResponse
	 */
	public static final JsonpValueParser<PutDataFrameAnalyticsResponse> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, PutDataFrameAnalyticsResponse::setupPutDataFrameAnalyticsResponseParser);

	protected static void setupPutDataFrameAnalyticsResponseParser(
			DelegatingJsonpValueParser<PutDataFrameAnalyticsResponse.Builder> op) {

		op.add(Builder::id, JsonpValueParser.stringParser(), "id");
		op.add(Builder::createTime, JsonpValueParser.numberParser(), "create_time");
		op.add(Builder::version, JsonpValueParser.stringParser(), "version");
		op.add(Builder::source, DataframeAnalyticsSource.JSONP_PARSER, "source");
		op.add(Builder::description, JsonpValueParser.stringParser(), "description");
		op.add(Builder::dest, DataframeAnalyticsDestination.JSONP_PARSER, "dest");
		op.add(Builder::modelMemoryLimit, JsonpValueParser.jsonValueParser(), "model_memory_limit");
		op.add(Builder::allowLazyStart, JsonpValueParser.booleanParser(), "allow_lazy_start");
		op.add(Builder::maxNumThreads, JsonpValueParser.numberParser(), "max_num_threads");
		op.add(Builder::analysis, DataframeAnalysisContainer.JSONP_PARSER, "analysis");
		op.add(Builder::analyzedFields, JsonpValueParser.jsonValueParser(), "analyzed_fields");

	}

}