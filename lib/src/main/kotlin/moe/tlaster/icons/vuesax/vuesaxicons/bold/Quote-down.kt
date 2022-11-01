package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.`Quote-down`: ImageVector
    get() {
        if (`_quote-down` != null) {
            return `_quote-down`!!
        }
        `_quote-down` = Builder(name = "Quote-down", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.9082f, 12.3714f)
                horizontalLineTo(20.5982f)
                curveTo(20.5182f, 17.0414f, 19.5982f, 17.8114f, 16.7282f, 19.5114f)
                curveTo(16.3982f, 19.7114f, 16.2882f, 20.1314f, 16.4882f, 20.4714f)
                curveTo(16.6882f, 20.8014f, 17.1082f, 20.9114f, 17.4482f, 20.7114f)
                curveTo(20.8282f, 18.7114f, 22.0082f, 17.4914f, 22.0082f, 11.6714f)
                verticalLineTo(6.2814f)
                curveTo(22.0082f, 4.5714f, 20.6182f, 3.1914f, 18.9182f, 3.1914f)
                horizontalLineTo(15.9182f)
                curveTo(14.1582f, 3.1914f, 12.8282f, 4.5214f, 12.8282f, 6.2814f)
                verticalLineTo(9.2814f)
                curveTo(12.8182f, 11.0414f, 14.1482f, 12.3714f, 15.9082f, 12.3714f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.09f, 12.3714f)
                horizontalLineTo(9.78f)
                curveTo(9.7f, 17.0414f, 8.78f, 17.8114f, 5.91f, 19.5114f)
                curveTo(5.58f, 19.7114f, 5.47f, 20.1314f, 5.67f, 20.4714f)
                curveTo(5.87f, 20.8014f, 6.29f, 20.9114f, 6.63f, 20.7114f)
                curveTo(10.01f, 18.7114f, 11.19f, 17.4914f, 11.19f, 11.6714f)
                verticalLineTo(6.2814f)
                curveTo(11.19f, 4.5714f, 9.8f, 3.1914f, 8.1f, 3.1914f)
                horizontalLineTo(5.1f)
                curveTo(3.33f, 3.1914f, 2.0f, 4.5214f, 2.0f, 6.2814f)
                verticalLineTo(9.2814f)
                curveTo(2.0f, 11.0414f, 3.33f, 12.3714f, 5.09f, 12.3714f)
                close()
            }
        }
        .build()
        return `_quote-down`!!
    }

private var `_quote-down`: ImageVector? = null
