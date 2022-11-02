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

public val BrokenGroup.Folderopen: ImageVector
    get() {
        if (_folderopen != null) {
            return _folderopen!!
        }
        _folderopen = Builder(name = "Folderopen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.3707f, 18.02f)
                lineTo(21.2707f, 19.3f)
                curveTo(21.1207f, 20.83f, 21.0007f, 22.0f, 18.2907f, 22.0f)
                horizontalLineTo(5.7107f)
                curveTo(3.0007f, 22.0f, 2.8807f, 20.83f, 2.7307f, 19.3f)
                lineTo(2.3307f, 14.3f)
                curveTo(2.2507f, 13.47f, 2.5107f, 12.7f, 2.9807f, 12.11f)
                curveTo(2.9907f, 12.1f, 2.9907f, 12.1f, 3.0007f, 12.09f)
                curveTo(3.5507f, 11.42f, 4.3807f, 11.0f, 5.3107f, 11.0f)
                horizontalLineTo(18.6907f)
                curveTo(19.6207f, 11.0f, 20.4407f, 11.42f, 20.9807f, 12.07f)
                curveTo(20.9907f, 12.08f, 21.0007f, 12.09f, 21.0007f, 12.1f)
                curveTo(21.4907f, 12.69f, 21.7607f, 13.46f, 21.6707f, 14.3f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.5f, 11.43f)
                verticalLineTo(6.28f)
                curveTo(3.5f, 2.88f, 4.35f, 2.03f, 7.75f, 2.03f)
                horizontalLineTo(9.02f)
                curveTo(10.29f, 2.03f, 10.58f, 2.41f, 11.06f, 3.05f)
                lineTo(12.33f, 4.75f)
                curveTo(12.65f, 5.17f, 12.84f, 5.43f, 13.69f, 5.43f)
                horizontalLineTo(16.24f)
                curveTo(19.64f, 5.43f, 20.49f, 6.28f, 20.49f, 9.68f)
                verticalLineTo(11.47f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.4297f, 17.0f)
                horizontalLineTo(14.5697f)
            }
        }
        .build()
        return _folderopen!!
    }

private var _folderopen: ImageVector? = null
