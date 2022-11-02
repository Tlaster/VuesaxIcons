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

public val BrokenGroup.Pausecircle: ImageVector
    get() {
        if (_pausecircle != null) {
            return _pausecircle!!
        }
        _pausecircle = Builder(name = "Pausecircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                curveTo(2.75f, 7.67f, 2.0f, 9.75f, 2.0f, 12.0f)
                curveTo(2.0f, 17.52f, 6.48f, 22.0f, 12.0f, 22.0f)
                curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                curveTo(10.57f, 2.0f, 9.2f, 2.3f, 7.97f, 2.85f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.7491f, 14.43f)
                verticalLineTo(9.37f)
                curveTo(10.7491f, 8.8899f, 10.5491f, 8.7f, 10.0391f, 8.7f)
                horizontalLineTo(8.7491f)
                curveTo(8.2391f, 8.7f, 8.0391f, 8.8899f, 8.0391f, 9.37f)
                verticalLineTo(14.43f)
                curveTo(8.0391f, 14.91f, 8.2391f, 15.1f, 8.7491f, 15.1f)
                horizontalLineTo(10.0391f)
                curveTo(10.5491f, 15.1f, 10.7491f, 14.91f, 10.7491f, 14.43f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0303f, 14.43f)
                verticalLineTo(9.37f)
                curveTo(16.0303f, 8.8899f, 15.8303f, 8.7f, 15.3203f, 8.7f)
                horizontalLineTo(14.0303f)
                curveTo(13.5203f, 8.7f, 13.3203f, 8.8899f, 13.3203f, 9.37f)
                verticalLineTo(14.43f)
                curveTo(13.3203f, 14.91f, 13.5203f, 15.1f, 14.0303f, 15.1f)
            }
        }
        .build()
        return _pausecircle!!
    }

private var _pausecircle: ImageVector? = null
