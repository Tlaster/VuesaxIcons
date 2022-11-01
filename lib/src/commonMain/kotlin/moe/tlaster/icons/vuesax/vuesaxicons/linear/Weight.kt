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

public val LinearGroup.Weight: ImageVector
    get() {
        if (_weight != null) {
            return _weight!!
        }
        _weight = Builder(name = "Weight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.1801f, 18.0f)
                curveTo(19.5801f, 18.0f, 20.1801f, 16.65f, 20.1801f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(20.1801f, 7.35f, 19.5801f, 6.0f, 17.1801f, 6.0f)
                curveTo(14.7801f, 6.0f, 14.1801f, 7.35f, 14.1801f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(14.1801f, 16.65f, 14.7801f, 18.0f, 17.1801f, 18.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.82f, 18.0f)
                curveTo(4.42f, 18.0f, 3.82f, 16.65f, 3.82f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(3.82f, 7.35f, 4.42f, 6.0f, 6.82f, 6.0f)
                curveTo(9.2199f, 6.0f, 9.82f, 7.35f, 9.82f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(9.82f, 16.65f, 9.2199f, 18.0f, 6.82f, 18.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.82f, 12.0f)
                horizontalLineTo(14.1799f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.5f, 14.5f)
                verticalLineTo(9.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.5f, 14.5f)
                verticalLineTo(9.5f)
            }
        }
        .build()
        return _weight!!
    }

private var _weight: ImageVector? = null
