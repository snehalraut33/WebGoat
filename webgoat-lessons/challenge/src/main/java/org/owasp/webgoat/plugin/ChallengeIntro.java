package org.owasp.webgoat.plugin;

import java.util.List;

import org.owasp.webgoat.lessons.Category;
import org.owasp.webgoat.lessons.NewLesson;

import com.google.common.collect.Lists;

/**
 * @author nbaars
 * @since 3/21/17.
 */
public class ChallengeIntro extends NewLesson {

    @Override
    public Category getDefaultCategory() {
        return Category.CHALLENGE;
    }

    @Override
    public List<String> getHints() {
        return Lists.newArrayList();
    }

    @Override
    public Integer getDefaultRanking() {
        return 10;
    }

    @Override
    public String getTitle() {
        return "challenge0.title";
    }

    @Override
    public String getId() {
        return "Challenge";
    }
}
