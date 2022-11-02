package moe.tlaster.icons.vuesax.vuesaxicons.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Convertshape: ImageVector
    get() {
        if (_convertshape != null) {
            return _convertshape!!
        }
        _convertshape = Builder(name = "Convertshape", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.85f, 2.0f)
                horizontalLineTo(16.15f)
                curveTo(13.9f, 2.0f, 13.0f, 2.9f, 13.0f, 5.15f)
                verticalLineTo(8.85f)
                curveTo(13.0f, 11.1f, 13.9f, 12.0f, 16.15f, 12.0f)
                horizontalLineTo(18.85f)
                curveTo(21.1f, 12.0f, 22.0f, 11.1f, 22.0f, 8.85f)
                verticalLineTo(5.96f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.15f, 22.0f)
                horizontalLineTo(7.85f)
                curveTo(10.1f, 22.0f, 11.0f, 21.1f, 11.0f, 18.85f)
                verticalLineTo(15.15f)
                curveTo(11.0f, 12.9f, 10.1f, 12.0f, 7.85f, 12.0f)
                horizontalLineTo(5.15f)
                curveTo(2.9f, 12.0f, 2.0f, 12.9f, 2.0f, 15.15f)
                verticalLineTo(18.16f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 15.0f)
                curveTo(22.0f, 18.87f, 18.87f, 22.0f, 15.0f, 22.0f)
                lineTo(16.05f, 20.25f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 9.0f)
                curveTo(2.0f, 5.13f, 5.13f, 2.0f, 9.0f, 2.0f)
                lineTo(7.95f, 3.75f)
            }
        }
        .build()
        return _convertshape!!
    }

private var _convertshape: ImageVector? = null
