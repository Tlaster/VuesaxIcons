package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.`Cloud-add`: ImageVector
    get() {
        if (`_cloud-add` != null) {
            return `_cloud-add`!!
        }
        `_cloud-add` = Builder(name = "Cloud-add", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.54f, 11.12f)
                curveTo(0.86f, 11.45f, 0.86f, 18.26f, 5.54f, 18.59f)
                horizontalLineTo(7.4601f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.59f, 11.12f)
                curveTo(2.38f, 2.19f, 15.92f, -1.38f, 17.47f, 8.0f)
                curveTo(21.8f, 8.55f, 23.55f, 14.32f, 20.27f, 17.19f)
                curveTo(19.27f, 18.1f, 17.98f, 18.6f, 16.63f, 18.59f)
                horizontalLineTo(16.54f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 16.53f)
                curveTo(17.0f, 17.27f, 16.84f, 17.97f, 16.54f, 18.59f)
                curveTo(16.46f, 18.77f, 16.37f, 18.94f, 16.27f, 19.1f)
                curveTo(15.41f, 20.55f, 13.82f, 21.53f, 12.0f, 21.53f)
                curveTo(10.18f, 21.53f, 8.59f, 20.55f, 7.73f, 19.1f)
                curveTo(7.63f, 18.94f, 7.54f, 18.77f, 7.46f, 18.59f)
                curveTo(7.16f, 17.97f, 7.0f, 17.27f, 7.0f, 16.53f)
                curveTo(7.0f, 13.77f, 9.24f, 11.53f, 12.0f, 11.53f)
                curveTo(14.76f, 11.53f, 17.0f, 13.77f, 17.0f, 16.53f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.4399f, 16.53f)
                lineTo(11.4299f, 17.5201f)
                lineTo(13.5599f, 15.55f)
            }
        }
        .build()
        return `_cloud-add`!!
    }

private var `_cloud-add`: ImageVector? = null
