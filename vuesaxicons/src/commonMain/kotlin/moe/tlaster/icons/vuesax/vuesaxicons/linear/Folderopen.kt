package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Folderopen: ImageVector
    get() {
        if (_folderopen != null) {
            return _folderopen!!
        }
        _folderopen = Builder(name = "Folderopen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.67f, 14.3f)
                lineTo(21.27f, 19.3f)
                curveTo(21.12f, 20.83f, 21.0f, 22.0f, 18.29f, 22.0f)
                horizontalLineTo(5.71f)
                curveTo(3.0f, 22.0f, 2.88f, 20.83f, 2.73f, 19.3f)
                lineTo(2.33f, 14.3f)
                curveTo(2.25f, 13.47f, 2.51f, 12.7f, 2.98f, 12.11f)
                curveTo(2.99f, 12.1f, 2.99f, 12.1f, 3.0f, 12.09f)
                curveTo(3.55f, 11.42f, 4.38f, 11.0f, 5.31f, 11.0f)
                horizontalLineTo(18.69f)
                curveTo(19.62f, 11.0f, 20.44f, 11.42f, 20.98f, 12.07f)
                curveTo(20.99f, 12.08f, 21.0f, 12.09f, 21.0f, 12.1f)
                curveTo(21.49f, 12.69f, 21.76f, 13.46f, 21.67f, 14.3f)
                close()
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
                moveTo(9.4299f, 17.0f)
                horizontalLineTo(14.5699f)
            }
        }
        .build()
        return _folderopen!!
    }

private var _folderopen: ImageVector? = null
