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

public val LinearGroup.`Filter-tick`: ImageVector
    get() {
        if (`_filter-tick` != null) {
            return `_filter-tick`!!
        }
        `_filter-tick` = Builder(name = "Filter-tick", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.63f, 14.75f)
                curveTo(21.63f, 15.64f, 21.39f, 16.48f, 20.95f, 17.2f)
                curveTo(20.13f, 18.57f, 18.62f, 19.5f, 16.88f, 19.5f)
                curveTo(15.94f, 19.5f, 15.06f, 19.22f, 14.32f, 18.73f)
                curveTo(13.7f, 18.35f, 13.19f, 17.82f, 12.82f, 17.2f)
                curveTo(12.38f, 16.48f, 12.13f, 15.64f, 12.13f, 14.75f)
                curveTo(12.13f, 12.13f, 14.26f, 10.0f, 16.88f, 10.0f)
                curveTo(17.24f, 10.0f, 17.59f, 10.04f, 17.92f, 10.12f)
                curveTo(20.05f, 10.59f, 21.63f, 12.49f, 21.63f, 14.75f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.03f, 14.75f)
                lineTo(16.2f, 15.92f)
                lineTo(18.73f, 13.58f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.6901f, 4.02f)
                verticalLineTo(6.24f)
                curveTo(20.6901f, 7.05f, 20.1801f, 8.06f, 19.6801f, 8.57f)
                lineTo(17.92f, 10.12f)
                curveTo(17.59f, 10.04f, 17.2401f, 10.0f, 16.8801f, 10.0f)
                curveTo(14.2601f, 10.0f, 12.1301f, 12.13f, 12.1301f, 14.75f)
                curveTo(12.1301f, 15.64f, 12.3801f, 16.48f, 12.8201f, 17.2f)
                curveTo(13.1901f, 17.82f, 13.7001f, 18.35f, 14.3201f, 18.73f)
                verticalLineTo(19.07f)
                curveTo(14.3201f, 19.68f, 13.92f, 20.49f, 13.41f, 20.79f)
                lineTo(12.0001f, 21.7f)
                curveTo(10.6901f, 22.51f, 8.8701f, 21.6f, 8.8701f, 19.98f)
                verticalLineTo(14.63f)
                curveTo(8.8701f, 13.92f, 8.4601f, 13.01f, 8.0601f, 12.51f)
                lineTo(4.22f, 8.47f)
                curveTo(3.72f, 7.96f, 3.3101f, 7.05f, 3.3101f, 6.45f)
                verticalLineTo(4.12f)
                curveTo(3.3101f, 2.91f, 4.2201f, 2.0f, 5.3301f, 2.0f)
                horizontalLineTo(18.67f)
                curveTo(19.78f, 2.0f, 20.6901f, 2.91f, 20.6901f, 4.02f)
                close()
            }
        }
        .build()
        return `_filter-tick`!!
    }

private var `_filter-tick`: ImageVector? = null
