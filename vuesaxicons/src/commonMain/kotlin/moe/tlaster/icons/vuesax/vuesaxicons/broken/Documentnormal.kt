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

public val BrokenGroup.Documentnormal: ImageVector
    get() {
        if (_documentnormal != null) {
            return _documentnormal!!
        }
        _documentnormal = Builder(name = "Documentnormal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.96f, 2.0f)
                horizontalLineTo(10.0f)
                curveTo(9.0f, 2.0f, 8.0f, 2.0f, 8.0f, 4.0f)
                curveTo(8.0f, 6.0f, 9.0f, 6.0f, 10.0f, 6.0f)
                horizontalLineTo(14.0f)
                curveTo(16.0f, 6.0f, 16.0f, 5.0f, 16.0f, 4.0f)
                curveTo(16.0f, 2.0f, 15.0f, 2.0f, 14.0f, 2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 10.0f)
                curveTo(3.0f, 5.44f, 4.67f, 4.2f, 8.0f, 4.02f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 4.02f)
                curveTo(19.33f, 4.2f, 21.0f, 5.43f, 21.0f, 10.0f)
                verticalLineTo(16.0f)
                curveTo(21.0f, 20.0f, 20.0f, 22.0f, 15.0f, 22.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 22.0f, 3.0f, 20.0f, 3.0f, 16.0f)
                verticalLineTo(13.91f)
            }
        }
        .build()
        return _documentnormal!!
    }

private var _documentnormal: ImageVector? = null
