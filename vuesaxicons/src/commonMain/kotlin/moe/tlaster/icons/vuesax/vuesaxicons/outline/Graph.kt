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

public val OutlineGroup.Graph: ImageVector
    get() {
        if (_graph != null) {
            return _graph!!
        }
        _graph = Builder(name = "Graph", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.32f, 12.75f)
                horizontalLineTo(15.0f)
                curveTo(12.51f, 12.75f, 11.25f, 11.34f, 11.25f, 8.55f)
                verticalLineTo(5.68f)
                curveTo(11.25f, 4.66f, 11.37f, 3.2f, 12.43f, 2.4f)
                curveTo(13.32f, 1.74f, 14.6f, 1.69f, 16.49f, 2.24f)
                curveTo(18.97f, 2.96f, 21.04f, 5.03f, 21.76f, 7.51f)
                curveTo(22.31f, 9.39f, 22.26f, 10.68f, 21.6f, 11.56f)
                curveTo(20.8f, 12.63f, 19.34f, 12.75f, 18.32f, 12.75f)
                close()
                moveTo(14.28f, 3.36f)
                curveTo(13.87f, 3.36f, 13.55f, 3.44f, 13.34f, 3.6f)
                curveTo(12.95f, 3.89f, 12.76f, 4.57f, 12.76f, 5.68f)
                verticalLineTo(8.56f)
                curveTo(12.76f, 10.8f, 13.62f, 11.26f, 15.01f, 11.26f)
                horizontalLineTo(18.33f)
                curveTo(19.43f, 11.26f, 20.11f, 11.07f, 20.41f, 10.68f)
                curveTo(20.76f, 10.22f, 20.73f, 9.3f, 20.34f, 7.95f)
                curveTo(19.76f, 5.98f, 18.06f, 4.27f, 16.09f, 3.7f)
                curveTo(15.35f, 3.47f, 14.75f, 3.36f, 14.28f, 3.36f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0704f, 22.7498f)
                curveTo(10.5404f, 22.7498f, 10.0004f, 22.7098f, 9.4604f, 22.6198f)
                curveTo(5.3704f, 21.9598f, 2.0404f, 18.6398f, 1.3804f, 14.5498f)
                curveTo(0.5304f, 9.2898f, 3.9204f, 4.3298f, 9.1104f, 3.2698f)
                curveTo(9.5204f, 3.1898f, 9.9104f, 3.4498f, 10.0004f, 3.8498f)
                curveTo(10.0804f, 4.2598f, 9.8204f, 4.6498f, 9.4204f, 4.7398f)
                curveTo(5.0304f, 5.6398f, 2.1504f, 9.8398f, 2.8804f, 14.3098f)
                curveTo(3.4404f, 17.7698f, 6.2504f, 20.5798f, 9.7104f, 21.1398f)
                curveTo(14.2004f, 21.8598f, 18.3904f, 18.9698f, 19.2804f, 14.5598f)
                curveTo(19.3604f, 14.1498f, 19.7604f, 13.8898f, 20.1604f, 13.9698f)
                curveTo(20.5704f, 14.0498f, 20.8304f, 14.4498f, 20.7504f, 14.8498f)
                curveTo(19.8004f, 19.5198f, 15.7204f, 22.7498f, 11.0704f, 22.7498f)
                close()
            }
        }
        .build()
        return _graph!!
    }

private var _graph: ImageVector? = null
