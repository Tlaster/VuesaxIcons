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

public val LinearGroup.Archivebook: ImageVector
    get() {
        if (_archivebook != null) {
            return _archivebook!!
        }
        _archivebook = Builder(name = "Archivebook", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(21.0f, 20.0f, 19.5f, 22.0f, 16.0f, 22.0f)
                horizontalLineTo(8.0f)
                curveTo(4.5f, 22.0f, 3.0f, 20.0f, 3.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(3.0f, 4.0f, 4.5f, 2.0f, 8.0f, 2.0f)
                horizontalLineTo(16.0f)
                curveTo(19.5f, 2.0f, 21.0f, 4.0f, 21.0f, 7.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.5f, 2.0f)
                verticalLineTo(9.86f)
                curveTo(15.5f, 10.3f, 14.98f, 10.52f, 14.66f, 10.23f)
                lineTo(12.34f, 8.09f)
                curveTo(12.15f, 7.91f, 11.85f, 7.91f, 11.66f, 8.09f)
                lineTo(9.34f, 10.23f)
                curveTo(9.02f, 10.52f, 8.5f, 10.3f, 8.5f, 9.86f)
                verticalLineTo(2.0f)
                horizontalLineTo(15.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.25f, 14.0f)
                horizontalLineTo(17.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 18.0f)
                horizontalLineTo(17.5f)
            }
        }
        .build()
        return _archivebook!!
    }

private var _archivebook: ImageVector? = null
