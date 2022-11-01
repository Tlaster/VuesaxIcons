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

public val BoldGroup.`Audio-square`: ImageVector
    get() {
        if (`_audio-square` != null) {
            return `_audio-square`!!
        }
        `_audio-square` = Builder(name = "Audio-square", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.6698f, 13.9219f)
                curveTo(8.9298f, 13.9219f, 8.3398f, 14.5219f, 8.3398f, 15.2619f)
                curveTo(8.3398f, 16.0019f, 8.9398f, 16.5919f, 9.6698f, 16.5919f)
                curveTo(10.4098f, 16.5919f, 11.0098f, 15.9919f, 11.0098f, 15.2619f)
                curveTo(11.0098f, 14.5219f, 10.4098f, 13.9219f, 9.6698f, 13.9219f)
                close()
            }
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
                moveTo(17.12f, 9.8f)
                curveTo(17.12f, 10.41f, 16.86f, 10.95f, 16.42f, 11.27f)
                curveTo(16.14f, 11.47f, 15.8f, 11.58f, 15.44f, 11.58f)
                curveTo(15.23f, 11.58f, 15.02f, 11.54f, 14.8f, 11.47f)
                lineTo(12.51f, 10.71f)
                curveTo(12.5f, 10.71f, 12.48f, 10.7f, 12.47f, 10.69f)
                verticalLineTo(15.25f)
                curveTo(12.47f, 16.79f, 11.21f, 18.05f, 9.67f, 18.05f)
                curveTo(8.13f, 18.05f, 6.87f, 16.79f, 6.87f, 15.25f)
                curveTo(6.87f, 13.71f, 8.13f, 12.45f, 9.67f, 12.45f)
                curveTo(10.16f, 12.45f, 10.61f, 12.59f, 11.01f, 12.8f)
                verticalLineTo(8.63f)
                verticalLineTo(8.02f)
                curveTo(11.01f, 7.41f, 11.27f, 6.87f, 11.71f, 6.55f)
                curveTo(12.16f, 6.23f, 12.75f, 6.15f, 13.33f, 6.35f)
                lineTo(15.62f, 7.11f)
                curveTo(16.48f, 7.4f, 17.13f, 8.3f, 17.13f, 9.2f)
                verticalLineTo(9.8f)
                horizontalLineTo(17.12f)
                close()
            }
        }
        .build()
        return `_audio-square`!!
    }

private var `_audio-square`: ImageVector? = null
