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

public val BoldGroup.Danger: ImageVector
    get() {
        if (_danger != null) {
            return _danger!!
        }
        _danger = Builder(name = "Danger", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.7605f, 15.92f)
                lineTo(15.3605f, 4.4f)
                curveTo(14.5005f, 2.85f, 13.3105f, 2.0f, 12.0005f, 2.0f)
                curveTo(10.6905f, 2.0f, 9.5005f, 2.85f, 8.6405f, 4.4f)
                lineTo(2.2405f, 15.92f)
                curveTo(1.4305f, 17.39f, 1.3405f, 18.8f, 1.9905f, 19.91f)
                curveTo(2.6405f, 21.02f, 3.9205f, 21.63f, 5.6005f, 21.63f)
                horizontalLineTo(18.4005f)
                curveTo(20.0805f, 21.63f, 21.3605f, 21.02f, 22.0105f, 19.91f)
                curveTo(22.6605f, 18.8f, 22.5705f, 17.38f, 21.7605f, 15.92f)
                close()
                moveTo(11.2505f, 9.0f)
                curveTo(11.2505f, 8.59f, 11.5905f, 8.25f, 12.0005f, 8.25f)
                curveTo(12.4105f, 8.25f, 12.7505f, 8.59f, 12.7505f, 9.0f)
                verticalLineTo(14.0f)
                curveTo(12.7505f, 14.41f, 12.4105f, 14.75f, 12.0005f, 14.75f)
                curveTo(11.5905f, 14.75f, 11.2505f, 14.41f, 11.2505f, 14.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(12.7105f, 17.71f)
                curveTo(12.6605f, 17.75f, 12.6105f, 17.79f, 12.5605f, 17.83f)
                curveTo(12.5005f, 17.87f, 12.4405f, 17.9f, 12.3805f, 17.92f)
                curveTo(12.3205f, 17.95f, 12.2605f, 17.97f, 12.1905f, 17.98f)
                curveTo(12.1305f, 17.99f, 12.0605f, 18.0f, 12.0005f, 18.0f)
                curveTo(11.9405f, 18.0f, 11.8705f, 17.99f, 11.8005f, 17.98f)
                curveTo(11.7405f, 17.97f, 11.6805f, 17.95f, 11.6205f, 17.92f)
                curveTo(11.5605f, 17.9f, 11.5005f, 17.87f, 11.4405f, 17.83f)
                curveTo(11.3905f, 17.79f, 11.3405f, 17.75f, 11.2905f, 17.71f)
                curveTo(11.1105f, 17.52f, 11.0005f, 17.26f, 11.0005f, 17.0f)
                curveTo(11.0005f, 16.74f, 11.1105f, 16.48f, 11.2905f, 16.29f)
                curveTo(11.3405f, 16.25f, 11.3905f, 16.21f, 11.4405f, 16.17f)
                curveTo(11.5005f, 16.13f, 11.5605f, 16.1f, 11.6205f, 16.08f)
                curveTo(11.6805f, 16.05f, 11.7405f, 16.03f, 11.8005f, 16.02f)
                curveTo(11.9305f, 15.99f, 12.0705f, 15.99f, 12.1905f, 16.02f)
                curveTo(12.2605f, 16.03f, 12.3205f, 16.05f, 12.3805f, 16.08f)
                curveTo(12.4405f, 16.1f, 12.5005f, 16.13f, 12.5605f, 16.17f)
                curveTo(12.6105f, 16.21f, 12.6605f, 16.25f, 12.7105f, 16.29f)
                curveTo(12.8905f, 16.48f, 13.0005f, 16.74f, 13.0005f, 17.0f)
                curveTo(13.0005f, 17.26f, 12.8905f, 17.52f, 12.7105f, 17.71f)
                close()
            }
        }
        .build()
        return _danger!!
    }

private var _danger: ImageVector? = null
