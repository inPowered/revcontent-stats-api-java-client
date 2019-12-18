package com.xy1m.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Maps;
import com.xy1m.RevContent;
import com.xy1m.internal.config.SerializationConfig;
import com.xy1m.internal.serialization.SerializationMapperCreator;
import com.xy1m.model.EnumEnabled;
import com.xy1m.model.EnumOptimize;
import com.xy1m.model.ResultCampaign;
import com.xy1m.model.ResultsData;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.auth.Token;
import com.xy1m.model.boost.Boost;
import com.xy1m.model.conversion.Conversion;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;
import java.util.UUID;

public class BoostServiceImplTest {
    private static RevContent revContent;
    private static Authentication auth;
    private static ObjectMapper objectMapper;
    private static String BOOST_ID = "636673";

    /**
     * Token expires in 24 hours so testing is ok
     */
    @BeforeClass
    public static void setUp() {
        revContent = RevContent.builder().build();
        Token token = new Token();
        token.setAccessToken("8b096d6a1925e7a20e710eef8d6d40757e492bbd");
        auth = new Authentication(null, token);
        objectMapper = SerializationMapperCreator.createObjectMapper(new SerializationConfig());
    }

    @Test
    @Ignore
    public void listBoosts() throws JsonProcessingException {
        ResultsData<Boost> result = revContent.campaignsService().listBoosts(auth, Maps.newHashMap());
        System.out.println(objectMapper.writeValueAsString(result));
        Assert.assertNotNull(result.getData());
    }

    @Test
    @Ignore
    public void addBoost() throws JsonProcessingException {
        Conversion conversion = new Conversion();
        conversion.setId("4900");
        ResultCampaign<Boost> result = revContent.campaignsService().addBoost(auth,
                Boost.APIRequestAddBuilder.builder()
                        .name("cpa campaign with conversion from sdk-" + UUID.randomUUID())
                        .optimize(EnumOptimize.cpa)
                        .conversion(Arrays.asList(conversion))
                        .build()
        );
        System.out.println(objectMapper.writeValueAsString(result));
        Assert.assertNotNull(result.getCampaign().getId());
    }

    @Test
    @Ignore
    public void updateBoost() throws JsonProcessingException {
        Boost result = revContent.campaignsService().updateBoost(auth, BOOST_ID,
                Boost.APIRequestUpdateBuilder.builder()
                        .name("rename from updateContent-" + UUID.randomUUID())
                        .build()
        );
        System.out.println(objectMapper.writeValueAsString(result));
        Assert.assertNotNull(result.getId());
    }

    @Test
    @Ignore
    public void updateBoostStatus() throws JsonProcessingException {
        Boost result = revContent.campaignsService().updateBoostStatus(auth,
                Boost.APIRequestUpdateBuilder.builder()
                        .id(BOOST_ID)
                        .enabled(EnumEnabled.on)
                        .build());
        System.out.println(objectMapper.writeValueAsString(result));
        Assert.assertNotNull(result.getId());
    }
}