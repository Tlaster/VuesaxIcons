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

public val LinearGroup.Monitormobbile: ImageVector
    get() {
        if (_monitormobbile != null) {
            return _monitormobbile!!
        }
        _monitormobbile = Builder(name = "Monitormobbile", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 16.95f)
                horizontalLineTo(6.21f)
                curveTo(2.84f, 16.95f, 2.0f, 16.11f, 2.0f, 12.74f)
                verticalLineTo(6.74f)
                curveTo(2.0f, 3.37f, 2.84f, 2.53f, 6.21f, 2.53f)
                horizontalLineTo(16.74f)
                curveTo(20.11f, 2.53f, 20.95f, 3.37f, 20.95f, 6.74f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 21.4699f)
                verticalLineTo(16.95f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.95f)
                horizontalLineTo(10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.74f, 21.47f)
                horizontalLineTo(10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 12.8f)
                verticalLineTo(18.51f)
                curveTo(22.0f, 20.88f, 21.41f, 21.47f, 19.04f, 21.47f)
                horizontalLineTo(15.49f)
                curveTo(13.12f, 21.47f, 12.53f, 20.88f, 12.53f, 18.51f)
                verticalLineTo(12.8f)
                curveTo(12.53f, 10.43f, 13.12f, 9.84f, 15.49f, 9.84f)
                horizontalLineTo(19.04f)
                curveTo(21.41f, 9.84f, 22.0f, 10.43f, 22.0f, 12.8f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.2445f, 18.25f)
                horizontalLineTo(17.2535f)
            }
        }
        .build()
        return _monitormobbile!!
    }

private var _monitormobbile: ImageVector? = null
