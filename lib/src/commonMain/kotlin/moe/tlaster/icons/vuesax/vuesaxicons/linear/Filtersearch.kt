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

public val LinearGroup.Filtersearch: ImageVector
    get() {
        if (_filtersearch != null) {
            return _filtersearch!!
        }
        _filtersearch = Builder(name = "Filtersearch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.3201f, 19.07f)
                curveTo(14.3201f, 19.68f, 13.92f, 20.48f, 13.41f, 20.79f)
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
                moveTo(16.07f, 16.52f)
                curveTo(17.8373f, 16.52f, 19.27f, 15.0873f, 19.27f, 13.32f)
                curveTo(19.27f, 11.5527f, 17.8373f, 10.12f, 16.07f, 10.12f)
                curveTo(14.3027f, 10.12f, 12.87f, 11.5527f, 12.87f, 13.32f)
                curveTo(12.87f, 15.0873f, 14.3027f, 16.52f, 16.07f, 16.52f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.87f, 17.12f)
                lineTo(18.87f, 16.12f)
            }
        }
        .build()
        return _filtersearch!!
    }

private var _filtersearch: ImageVector? = null
