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

public val LinearGroup.`Filter-edit`: ImageVector
    get() {
        if (`_filter-edit` != null) {
            return `_filter-edit`!!
        }
        `_filter-edit` = Builder(name = "Filter-edit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.41f, 20.79f)
                lineTo(12.0001f, 21.7f)
                curveTo(10.6901f, 22.51f, 8.8701f, 21.6f, 8.8701f, 19.98f)
                verticalLineTo(14.63f)
                curveTo(8.8701f, 13.92f, 8.4701f, 13.01f, 8.0601f, 12.51f)
                lineTo(4.22f, 8.47f)
                curveTo(3.71f, 7.96f, 3.3101f, 7.06f, 3.3101f, 6.45f)
                verticalLineTo(4.13f)
                curveTo(3.3101f, 2.92f, 4.2201f, 2.01f, 5.3301f, 2.01f)
                horizontalLineTo(18.67f)
                curveTo(19.78f, 2.01f, 20.6901f, 2.92f, 20.6901f, 4.03f)
                verticalLineTo(6.25f)
                curveTo(20.6901f, 7.06f, 20.1801f, 8.07f, 19.6801f, 8.57f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0799f, 11.89f)
                lineTo(13.5399f, 15.43f)
                curveTo(13.3999f, 15.57f, 13.2699f, 15.83f, 13.2399f, 16.02f)
                lineTo(13.0499f, 17.37f)
                curveTo(12.9799f, 17.86f, 13.3199f, 18.2f, 13.8099f, 18.13f)
                lineTo(15.1599f, 17.94f)
                curveTo(15.3499f, 17.91f, 15.6199f, 17.78f, 15.7499f, 17.64f)
                lineTo(19.2899f, 14.1f)
                curveTo(19.8999f, 13.49f, 20.1899f, 12.78f, 19.2899f, 11.88f)
                curveTo(18.3999f, 10.99f, 17.6899f, 11.28f, 17.0799f, 11.89f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.58f, 12.39f)
                curveTo(16.88f, 13.47f, 17.7199f, 14.31f, 18.7999f, 14.61f)
            }
        }
        .build()
        return `_filter-edit`!!
    }

private var `_filter-edit`: ImageVector? = null
