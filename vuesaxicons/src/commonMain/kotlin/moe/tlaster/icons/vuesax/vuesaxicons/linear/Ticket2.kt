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

public val LinearGroup.Ticket2: ImageVector
    get() {
        if (_ticket2 != null) {
            return _ticket2!!
        }
        _ticket2 = Builder(name = "Ticket2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.91f, 14.6924f)
                curveTo(18.91f, 15.9824f, 19.97f, 17.0324f, 21.26f, 17.0324f)
                curveTo(21.26f, 20.7824f, 20.32f, 21.7224f, 16.57f, 21.7224f)
                horizontalLineTo(7.19f)
                curveTo(3.44f, 21.7224f, 2.5f, 20.7824f, 2.5f, 17.0324f)
                verticalLineTo(16.5724f)
                curveTo(3.79f, 16.5724f, 4.85f, 15.5124f, 4.85f, 14.2224f)
                curveTo(4.85f, 12.9324f, 3.79f, 11.8724f, 2.5f, 11.8724f)
                verticalLineTo(11.4124f)
                curveTo(2.51f, 7.6624f, 3.44f, 6.7224f, 7.19f, 6.7224f)
                horizontalLineTo(16.56f)
                curveTo(20.31f, 6.7224f, 21.25f, 7.6624f, 21.25f, 11.4124f)
                verticalLineTo(12.3524f)
                curveTo(19.96f, 12.3524f, 18.91f, 13.3924f, 18.91f, 14.6924f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.2111f, 6.7225f)
                horizontalLineTo(7.1211f)
                lineTo(10.0511f, 3.7925f)
                curveTo(12.4411f, 1.4025f, 13.6411f, 1.4025f, 16.0311f, 3.7925f)
                lineTo(16.6311f, 4.3925f)
                curveTo(16.0011f, 5.0225f, 15.8511f, 5.9525f, 16.2111f, 6.7225f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.8789f, 6.7227f)
                lineTo(9.8789f, 21.7227f)
            }
        }
        .build()
        return _ticket2!!
    }

private var _ticket2: ImageVector? = null
