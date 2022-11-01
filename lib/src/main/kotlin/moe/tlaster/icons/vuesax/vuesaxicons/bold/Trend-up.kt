package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.`Trend-up`: ImageVector
    get() {
        if (`_trend-up` != null) {
            return `_trend-up`!!
        }
        `_trend-up` = Builder(name = "Trend-up", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.19f, 2.0f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2.0f, 2.0f, 4.17f, 2.0f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2.0f, 19.83f, 4.17f, 22.0f, 7.81f, 22.0f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22.0f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22.0f, 4.17f, 19.83f, 2.0f, 16.19f, 2.0f)
                close()
                moveTo(16.88f, 11.53f)
                curveTo(16.88f, 11.92f, 16.57f, 12.23f, 16.18f, 12.23f)
                curveTo(15.79f, 12.23f, 15.48f, 11.92f, 15.48f, 11.53f)
                verticalLineTo(11.35f)
                lineTo(12.76f, 14.07f)
                curveTo(12.61f, 14.22f, 12.41f, 14.29f, 12.2f, 14.27f)
                curveTo(11.99f, 14.25f, 11.8f, 14.14f, 11.69f, 13.96f)
                lineTo(10.67f, 12.44f)
                lineTo(8.29f, 14.82f)
                curveTo(8.15f, 14.96f, 7.98f, 15.02f, 7.8f, 15.02f)
                curveTo(7.62f, 15.02f, 7.44f, 14.95f, 7.31f, 14.82f)
                curveTo(7.04f, 14.55f, 7.04f, 14.11f, 7.31f, 13.83f)
                lineTo(10.29f, 10.85f)
                curveTo(10.44f, 10.7f, 10.64f, 10.63f, 10.85f, 10.65f)
                curveTo(11.06f, 10.67f, 11.25f, 10.78f, 11.36f, 10.96f)
                lineTo(12.38f, 12.48f)
                lineTo(14.49f, 10.37f)
                horizontalLineTo(14.31f)
                curveTo(13.92f, 10.37f, 13.61f, 10.06f, 13.61f, 9.67f)
                curveTo(13.61f, 9.28f, 13.92f, 8.97f, 14.31f, 8.97f)
                horizontalLineTo(16.17f)
                curveTo(16.26f, 8.97f, 16.35f, 8.99f, 16.44f, 9.02f)
                curveTo(16.61f, 9.09f, 16.75f, 9.23f, 16.82f, 9.4f)
                curveTo(16.86f, 9.49f, 16.87f, 9.58f, 16.87f, 9.67f)
                verticalLineTo(11.53f)
                horizontalLineTo(16.88f)
                close()
            }
        }
        .build()
        return `_trend-up`!!
    }

private var `_trend-up`: ImageVector? = null
