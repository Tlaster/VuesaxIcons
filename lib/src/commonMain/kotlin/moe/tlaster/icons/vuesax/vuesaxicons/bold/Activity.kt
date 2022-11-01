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

public val BoldGroup.Activity: ImageVector
    get() {
        if (_activity != null) {
            return _activity!!
        }
        _activity = Builder(name = "Activity", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(17.26f, 9.96f)
                lineTo(14.95f, 12.94f)
                curveTo(14.66f, 13.31f, 14.25f, 13.55f, 13.78f, 13.6f)
                curveTo(13.31f, 13.66f, 12.85f, 13.53f, 12.48f, 13.24f)
                lineTo(10.65f, 11.8f)
                curveTo(10.58f, 11.74f, 10.5f, 11.74f, 10.46f, 11.75f)
                curveTo(10.42f, 11.75f, 10.35f, 11.77f, 10.29f, 11.85f)
                lineTo(7.91f, 14.94f)
                curveTo(7.76f, 15.13f, 7.54f, 15.23f, 7.32f, 15.23f)
                curveTo(7.16f, 15.23f, 7.0f, 15.18f, 6.86f, 15.07f)
                curveTo(6.53f, 14.82f, 6.47f, 14.35f, 6.72f, 14.02f)
                lineTo(9.1f, 10.93f)
                curveTo(9.39f, 10.56f, 9.8f, 10.32f, 10.27f, 10.26f)
                curveTo(10.73f, 10.2f, 11.2f, 10.33f, 11.57f, 10.62f)
                lineTo(13.4f, 12.06f)
                curveTo(13.47f, 12.12f, 13.54f, 12.12f, 13.59f, 12.11f)
                curveTo(13.63f, 12.11f, 13.7f, 12.09f, 13.76f, 12.01f)
                lineTo(16.07f, 9.03f)
                curveTo(16.32f, 8.7f, 16.8f, 8.64f, 17.12f, 8.9f)
                curveTo(17.45f, 9.17f, 17.51f, 9.64f, 17.26f, 9.96f)
                close()
            }
        }
        .build()
        return _activity!!
    }

private var _activity: ImageVector? = null
