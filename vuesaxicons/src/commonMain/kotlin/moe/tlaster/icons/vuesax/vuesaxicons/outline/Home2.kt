package moe.tlaster.icons.vuesax.vuesaxicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Home2: ImageVector
    get() {
        if (_home2 != null) {
            return _home2!!
        }
        _home2 = Builder(name = "Home2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.79f, 22.75f)
                horizontalLineTo(6.21f)
                curveTo(3.47f, 22.75f, 1.25f, 20.52f, 1.25f, 17.78f)
                verticalLineTo(10.37f)
                curveTo(1.25f, 9.01f, 2.09f, 7.3f, 3.17f, 6.46f)
                lineTo(8.56f, 2.26f)
                curveTo(10.18f, 1.0f, 12.77f, 0.94f, 14.45f, 2.12f)
                lineTo(20.63f, 6.45f)
                curveTo(21.82f, 7.28f, 22.75f, 9.06f, 22.75f, 10.51f)
                verticalLineTo(17.79f)
                curveTo(22.75f, 20.52f, 20.53f, 22.75f, 17.79f, 22.75f)
                close()
                moveTo(9.48f, 3.44f)
                lineTo(4.09f, 7.64f)
                curveTo(3.38f, 8.2f, 2.75f, 9.47f, 2.75f, 10.37f)
                verticalLineTo(17.78f)
                curveTo(2.75f, 19.69f, 4.3f, 21.25f, 6.21f, 21.25f)
                horizontalLineTo(17.79f)
                curveTo(19.7f, 21.25f, 21.25f, 19.7f, 21.25f, 17.79f)
                verticalLineTo(10.51f)
                curveTo(21.25f, 9.55f, 20.56f, 8.22f, 19.77f, 7.68f)
                lineTo(13.59f, 3.35f)
                curveTo(12.45f, 2.55f, 10.57f, 2.59f, 9.48f, 3.44f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.75f)
                curveTo(11.59f, 18.75f, 11.25f, 18.41f, 11.25f, 18.0f)
                verticalLineTo(15.0f)
                curveTo(11.25f, 14.59f, 11.59f, 14.25f, 12.0f, 14.25f)
                curveTo(12.41f, 14.25f, 12.75f, 14.59f, 12.75f, 15.0f)
                verticalLineTo(18.0f)
                curveTo(12.75f, 18.41f, 12.41f, 18.75f, 12.0f, 18.75f)
                close()
            }
        }
        .build()
        return _home2!!
    }

private var _home2: ImageVector? = null
